package bitcamp.myapp.command;

import bitcamp.myapp.util.LinkedList;
import bitcamp.myapp.util.Prompt;
import bitcamp.myapp.vo.Expense;
import bitcamp.myapp.vo.Import;

public class ExpencsCommand {

    LinkedList projectList = new LinkedList();
    LinkedList userList;

    public ExpencsCommand(LinkedList userList) {
        this.userList = userList;
    }

    private void addMembers(Expense expense) {
        while (true) {
            int userNo = Prompt.inputInt("추가할 팀원 번호?(종료: 0)");
            if (userNo == 0) {
                break;
            }

            Import anImport = (Import) userList.get(userList.indexOf(new Import(userNo)));
            if (anImport == null) {
                System.out.println("없는 팀원입니다.");
                continue;
            }

            if (expense.getMembers().contains(anImport)) {
                System.out.printf("'%s'은 현재 팀원입니다.\n", anImport.getName());
                continue;
            }

            expense.getMembers().add(anImport);
            System.out.printf("'%s'을 추가했습니다.\n", anImport.getName());
        }
    }

    private void deleteMembers(Expense expense) {
        Object[] members = expense.getMembers().toArray();
        for (Object obj : members) {
            int index = expense.getMembers().indexOf(obj);
            Import member = (Import) obj;
            String str = Prompt.input("팀원(%s) 삭제?", member.getName());
            if (str.equalsIgnoreCase("y")) {
                expense.getMembers().remove(index);
                System.out.printf("'%s' 팀원을 삭제합니다.\n", member.getName());
            } else {
                System.out.printf("'%s' 팀원을 유지합니다.\n", member.getName());
            }
        }
    }

    public void executeProjectCommand(String command) {
        System.out.printf("[%s]\n", command);
        switch (command) {
            case "등록":
                this.addProject();
                break;
            case "조회":
                this.viewProject();
                break;
            case "목록":
                this.listProject();
                break;
            case "변경":
                this.updateProject();
                break;
            case "삭제":
                this.deleteProject();
                break;
        }
    }

    private void addProject() {
        Expense expense = new Expense();
        expense.setTitle(Prompt.input("프로젝트명?"));
        expense.setDescription(Prompt.input("설명?"));
        expense.setTransactionDate(Prompt.input("시작일?"));
        expense.setEndDate(Prompt.input("종료일?"));

        System.out.println("팀원:");
        addMembers(expense);

        expense.setNo(Expense.getNextSeqNo());

        projectList.add(expense);

        System.out.println("등록했습니다.");
    }

    private void listProject() {
        System.out.println("번호 프로젝트 기간");
        for (Object obj : projectList.toArray()) {
            Expense expense = (Expense) obj;
            System.out.printf("%d %s %s ~ %s\n",
                    expense.getNo(), expense.getTitle(), expense.getTransactionDate(), expense.getEndDate());
        }
    }

    private void viewProject() {
        int projectNo = Prompt.inputInt("프로젝트 번호?");
        Expense expense = (Expense) projectList.get(projectList.indexOf(new Expense(projectNo)));
        if (expense == null) {
            System.out.println("없는 프로젝트입니다.");
            return;
        }

        System.out.printf("프로젝트명: %s\n", expense.getTitle());
        System.out.printf("설명: %s\n", expense.getDescription());
        System.out.printf("기간: %s ~ %s\n", expense.getTransactionDate(), expense.getEndDate());
        System.out.println("팀원:");
        for (int i = 0; i < expense.getMembers().size(); i++) {
            Import anImport = (Import) expense.getMembers().get(i);
            System.out.printf("- %s\n", anImport.getName());
        }
    }

    private void updateProject() {
        int projectNo = Prompt.inputInt("프로젝트 번호?");
        Expense expense = (Expense) projectList.get(projectList.indexOf(new Expense(projectNo)));
        if (expense == null) {
            System.out.println("없는 프로젝트입니다.");
            return;
        }

        expense.setTitle(Prompt.input("프로젝트명(%s)?", expense.getTitle()));
        expense.setDescription(Prompt.input("설명(%s)?", expense.getDescription()));
        expense.setTransactionDate(Prompt.input("시작일(%s)?", expense.getTransactionDate()));
        expense.setEndDate(Prompt.input("종료일(%s)?", expense.getEndDate()));

        System.out.println("팀원:");
        deleteMembers(expense);
        addMembers(expense);

        System.out.println("변경 했습니다.");
    }

    private void deleteProject() {
        int projectNo = Prompt.inputInt("프로젝트 번호?");
        Expense deletedExpense = (Expense) projectList.get(projectList.indexOf(new Expense(projectNo)));
        if (deletedExpense != null) {
            projectList.remove(projectList.indexOf(deletedExpense));
            System.out.printf("%d번 프로젝트를 삭제 했습니다.\n", deletedExpense.getNo());
        } else {
            System.out.println("없는 프로젝트입니다.");
        }
    }

}
