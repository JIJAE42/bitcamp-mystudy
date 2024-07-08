package bitcamp.myapp.command;

import bitcamp.myapp.util.LinkedList;
import bitcamp.myapp.util.Prompt;
import bitcamp.myapp.vo.Import;

public class ImportCommand {

    LinkedList userList = new LinkedList();

    public void executeUserCommand(String command) {
        System.out.printf("[%s]\n", command);
        switch (command) {
            case "등록":
                this.addUser();
                break;
            case "조회":
                this.viewUser();
                break;
            case "목록":
                this.listUser();
                break;
            case "변경":
                this.updateUser();
                break;
            case "삭제":
                this.deleteUser();
                break;
        }
    }

    private void addUser() {
        Import anImport = new Import();
        anImport.setName(Prompt.input("이름?"));
        anImport.setEmail(Prompt.input("이메일?"));
        anImport.setPassword(Prompt.input("암호?"));
        anImport.setTel(Prompt.input("연락처?"));
        anImport.setNo(Import.getNextSeqNo());
        userList.add(anImport);
    }

    private void listUser() {
        System.out.println("번호 이름 이메일");
        for (Object obj : userList.toArray()) {
            Import anImport = (Import) obj;
            System.out.printf("%d %s %s\n", anImport.getNo(), anImport.getName(), anImport.getEmail());
        }
    }

    private void viewUser() {
        int userNo = Prompt.inputInt("회원번호?");
        Import anImport = (Import) userList.get(userList.indexOf(new Import(userNo)));
        if (anImport == null) {
            System.out.println("없는 회원입니다.");
            return;
        }

        System.out.printf("이름: %s\n", anImport.getName());
        System.out.printf("이메일: %s\n", anImport.getEmail());
        System.out.printf("연락처: %s\n", anImport.getTel());
    }

    private void updateUser() {
        int userNo = Prompt.inputInt("회원번호?");
        Import anImport = (Import) userList.get(userList.indexOf(new Import(userNo)));
        if (anImport == null) {
            System.out.println("없는 회원입니다.");
            return;
        }

        anImport.setName(Prompt.input("이름(%s)?", anImport.getName()));
        anImport.setEmail(Prompt.input("이메일(%s)?", anImport.getEmail()));
        anImport.setPassword(Prompt.input("암호?"));
        anImport.setTel(Prompt.input("연락처(%s)?", anImport.getTel()));
        System.out.println("변경 했습니다.");
    }

    private void deleteUser() {
        int userNo = Prompt.inputInt("회원번호?");
        Import deletedImport = (Import) userList.get(userList.indexOf(new Import(userNo)));
        if (deletedImport != null) {
            userList.remove(userList.indexOf(deletedImport));
            System.out.printf("'%s' 회원을 삭제 했습니다.\n", deletedImport.getName());
        } else {
            System.out.println("없는 회원입니다.");
        }
    }

    public LinkedList getUserList() {
        return userList;
    }

}
