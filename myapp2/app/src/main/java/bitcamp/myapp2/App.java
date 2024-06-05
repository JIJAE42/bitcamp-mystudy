package bitcamp.myapp2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bold = "\033[1m";
        String reset = "\033[0m";
        String red = "\033[31m";

        String main = "[팀 프로젝트 관리 시스템]";
        String line = "-----------------------------";
        String menu1 = "1. 회원";
        String menu2 = "2. 팀";
        String menu3 = "3. 프로젝트";
        String menu4 = "4. 게시판";
        String menu5 = "5. 도움말";
        String menu6 = "6. 종료";

        System.out.println(bold + line + reset);
        System.out.println(bold + main + reset);
        System.out.println(menu1);
        System.out.println(menu2);
        System.out.println(menu3);
        System.out.println(menu4);
        System.out.println(menu5);
        System.out.println(bold + red + menu6 + reset);
        System.out.println(bold + line + reset);

        int i;
        do {
            System.out.print(">");
            i = scanner.nextInt();

            if (i == 1) {
                System.out.println("회원");
            }
            else if (i == 2) {
                System.out.println("팀");
            }
            else if (i == 3) {
                System.out.println("프로젝트");
            }
            else if (i == 4) {
                System.out.println("게시판");
            }
            else if (i == 5) {
                System.out.println("도움말");
            }
            else if (i == 6) {
                System.out.println("종료합니다.");
            } else {
                System.out.println("메뉴 번호가 옳지 않습니다.");
            } } while (i != 6) ;
        scanner.close();
    }
}