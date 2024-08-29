package bitcamp.myapp;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    static String[] menus = new String[]{
            "회원",
            "프로젝트",
            "게시판",
            "도움말",
            "종료",
    };

    public static void main(String[] args) {

        printMenu();

        String command;

        while (true) {
            try {
                command = prompt();

                if (command.equals("menu")) {
                    printMenu();
                } else {
                    int menuNo = Integer.parseInt(command);
                    String menuTitle = getMenuTitle(menuNo);
                    if (menuTitle == null) {
                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                    } else if (menuTitle.equals("종료")) {
                        break;
                    } else {
                        System.out.println(menuTitle);
                    }
                    // 유효한 번호, 종료, 유효하지 않는 번호 메뉴 처리 조건문 정리
                }
            } catch (Exception ex) {
                System.out.println("숫자로 메뉴 번호를 입력하세요.");
            } // 문자열로 바꾼 값에 맞춰 예외 처리 변경
        }
        // 메뉴 번호가 아닌 문자열의 예외를 받는 try catch 추가

        System.out.println("종료합니다.");

        // while 트루 일때 반복
        // if 종료 라면 브레이크로 반복문 나가고
        // 나머지는 배열 출력
        // 그밖엔 번호 옳지 않습니다.

        scanner.close();
        // 프린트 닫음
    }

    static void printMenu() {
        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";

        String appTile = "[팀 프로젝트]";
        String line = "-----------";


        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTile + resetAnsi);

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].equals("종료")) {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + resetAnsi), (i + 1), menus[i], resetAnsi);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }
        System.out.println(boldAnsi + line + resetAnsi);
    }

    static String prompt() {
        System.out.println("> ");
        return scanner.nextLine();
    }

    static boolean isValidateMenu(int menuNo) {
        return menuNo >= 1 && menuNo <= menus.length;
    }
    // 메뉴 번호 유효성 검증 코드

    static String getMenuTitle(int menuNo) {
        if (isValidateMenu(menuNo)) {
            return menus[menuNo - 1];
        }
        return null;
    }
    // 메뉴 타이틀 알아내는 코드
}