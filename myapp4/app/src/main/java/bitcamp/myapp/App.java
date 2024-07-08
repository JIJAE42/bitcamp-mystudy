package bitcamp.myapp;


import java.util.Scanner;

public class App {

    static Scanner keyboardScanner = new Scanner(System.in);

    public static String[] menus = {"등록", "목록", "조회", "변경", "삭제", "종료"};
    
    public static void main(String[] args) {
        printMenu();
        input();
    }

    public static void printMenu() {
        System.out.println("=====메뉴=====");
        for(int i = 0; i < menus.length; i++) {
            if (menus[i] == "종료") {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }
        System.out.println("==============");
    }

    public static void input(){
        String command;
        while (true) {
            try {
                command = prompt();

                if (command.equals("menu")) {
                } else {
                    printMenu();
                    int menuNo = Integer.parseInt(command);
                    String menuTitle = getMenuTitle(menuNo);
                    if (menuTitle == null) {
                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                    } else if (menuTitle.equals("종료")) {
                            break;
                    } else {
                        System.out.println(menuTitle);
                    }
                }
            } catch (Exception e) {
                System.out.println("숫자로 메뉴 번호를 입력하세요.");
            }
        }
        System.out.println("종료합니다.");

        keyboardScanner.close();
    }

    public static String prompt() {
        System.out.print("> ");
        return keyboardScanner.nextLine();
    }

    public static boolean isValidateMenu (int menuNo) {
        return 1 <= menuNo && menuNo <= menus.length;
    }
    public static String getMenuTitle(int menuNo){

        return isValidateMenu(menuNo) ? menus[menuNo - 1] : null;
    }
}
