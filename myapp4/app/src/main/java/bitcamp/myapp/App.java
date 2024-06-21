package bitcamp.myapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    static Scanner keyboardScanner = new Scanner(System.in);

    static String[] menus = new String[]{
            "회원",
            "팀",
            "프로젝트",
            "게시판",
            "도움말",
            "종료",
    };

    public static void main(String[] args) {
        System.out.println();

    }
    static String[] menus2 = new String[]{
            "등록",
            "목록",
            "조회",
            "변경",
            "삭제",
            "이전",
    };

    public static void main(String[] args) {

        printMenu(); // 메서드에 묶인 코드를 실행하는 것을 "메서드를 호출(call)한다"라고 부른다.

        String command;
        while (true) {
            try {
                command = prompt();

                if (command.equals("menu")) {
                    printMenu();

                } else {
                    int menuNo = Integer.parseInt(command);
                    String menuTitle = getMenuTitle(menuNo); // 설명하는 변수
                    if (menuTitle == null) {
                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                    } else if (menuTitle.equals("종료")) {
                        break;
                    } else {
                        System.out.println("[" + menuTitle + "]");

                        printMenu2();

                        String command2;
                        while (true) {
                            try {
                                command2 = prompt2();

                                if (command2.equals("menu")) {
                                    printMenu2();

                                } else {
                                    int menuNo2 = Integer.parseInt(command2);
                                    String menuTitle2 = getMenuTitle2(menuNo2); // 설명하는 변수
                                    if (menuTitle2 == null) {
                                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                                    } else if (menuTitle2.equals("이전")) {
                                        break;
                                    } else {
                                        System.out.println(menuTitle2 );
                                    }
                                }
                            } catch (NumberFormatException ex) {
                                System.out.println("숫자로 메뉴 번호를 입력하세요.");
                            }
                        }
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println("숫자로 메뉴 번호를 입력하세요.");
            }
        }


        System.out.println("종료합니다.");

        keyboardScanner.close();
    }

    static void printMenu() {
        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";

        String appTitle = "[팀 프로젝트 관리 시스템]";
        String line = "----------------------------------";

        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTitle + resetAnsi);

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].equals("종료")) {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i], resetAnsi);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }

        System.out.println(boldAnsi + line + resetAnsi);
    }


    static String prompt() {
        System.out.print("메인>");
        return keyboardScanner.nextLine();
    }

    static boolean isValidateMenu(int menuNo) {
        return menuNo >= 1 && menuNo <= menus.length;
    }

    static String getMenuTitle(int menuNo) {
//        if (isValidateMenu(menuNo)) {
//            return menus[menuNo - 1];
//        }
//        return null;
        return isValidateMenu(menuNo) ? menus[menuNo - 1] : null;
    }

    static void printMenu2() {

        for (int i = 0; i < menus2.length; i++) {
            System.out.printf("%d. %s\n", (i + 1), menus2[i]);
        }
    }

    static String prompt2() {
            System.out.print("메인/" + ">");
                     return keyboardScanner.nextLine();
    }

    static boolean isValidateMenu2(int menuNo2) {
        return menuNo2 >= 1 && menuNo2 <= menus2.length;
    }

    static String getMenuTitle2(int menuNo2) {
        return isValidateMenu2(menuNo2) ? menus2[menuNo2 - 1] : null;
    }
}
