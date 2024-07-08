package bitcamp.myapp.command;

import bitcamp.myapp.util.LinkedList;
import bitcamp.myapp.util.Prompt;
import bitcamp.myapp.vo.Statement;

import java.util.Date;

public class StatementCommand {

    LinkedList boardList = new LinkedList();

    public void executeBoardCommand(String command) {
        System.out.printf("[%s]\n", command);
        switch (command) {
            case "등록":
                this.addBoard();
                break;
            case "조회":
                this.viewBoard();
                break;
            case "목록":
                this.listBoard();
                break;
            case "변경":
                this.updateBoard();
                break;
            case "삭제":
                this.deleteBoard();
                break;
        }
    }

    private void deleteBoard() {
        int boardNo = Prompt.inputInt("게시글 번호?");
        Statement deletedStatement = (Statement) boardList.get(boardList.indexOf(new Statement(boardNo)));
        if (deletedStatement != null) {
            boardList.remove(boardList.indexOf(deletedStatement));
            System.out.printf("%d번 게시글을 삭제 했습니다.\n", deletedStatement.getNo());
        } else {
            System.out.println("없는 게시글입니다.");
        }
    }

    private void updateBoard() {
        int boardNo = Prompt.inputInt("게시글 번호?");
        Statement statement = (Statement) boardList.get(boardList.indexOf(new Statement(boardNo)));
        if (statement == null) {
            System.out.println("없는 게시글입니다.");
            return;
        }

        statement.setViewCount(statement.getViewCount() + 1);
        statement.setTitle(Prompt.input("제목(%s)?", statement.getTitle()));
        statement.setContent(Prompt.input("내용(%s)?", statement.getContent()));
        System.out.println("변경 했습니다.");
    }

    private void viewBoard() {
        int boardNo = Prompt.inputInt("게시글 번호?");
        Statement statement = (Statement) boardList.get(boardList.indexOf(new Statement(boardNo)));
        if (statement == null) {
            System.out.println("없는 게시글입니다.");
            return;
        }

        statement.setViewCount(statement.getViewCount() + 1);
        System.out.printf("제목: %s\n", statement.getTitle());
        System.out.printf("내용: %s\n", statement.getContent());
        System.out.printf("작성일: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", statement.getCreatedDate());
        System.out.printf("조회수: %d\n", statement.getViewCount());
    }

    private void listBoard() {
        System.out.println("번호 제목 작성일 조회수");
        for (Object obj : boardList.toArray()) {
            Statement statement = (Statement) obj;
            System.out.printf("%d %s %tY-%3$tm-%3$td %d\n",
                    statement.getNo(), statement.getTitle(), statement.getCreatedDate(), statement.getViewCount());
        }
    }

    private void addBoard() {
        Statement statement = new Statement();
        statement.setTitle(Prompt.input("제목?"));
        statement.setContent(Prompt.input("내용?"));
        statement.setCreatedDate(new Date());
        statement.setNo(Statement.getNextSeqNo());
        boardList.add(statement);
    }

}
