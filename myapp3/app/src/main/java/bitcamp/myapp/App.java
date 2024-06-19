package bitcamp.myapp;

public class App {
    public static void main(String[] args) {
        java.util.Scanner keyboardScanner = new java.util.Scanner(System.in);

        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";

        String appTitle = "[토끼에 대해 알려주세요!]";
        String line = "----------------------------------";
        String menu1 = "1. 이름은?";
        String menu2 = "2. 나이는?";
        String menu3 = "3. 예뻐요?";
        String menu4 = "4. 누구꺼죠?";
        String menu5 = "5. 오우";
        String menu6 = "6. 끝!";

        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTitle + resetAnsi);
        System.out.println(menu1);
        System.out.println(menu2);
        System.out.println(menu3);
        System.out.println(menu4);
        System.out.println(menu5);
        System.out.println(boldAnsi + redAnsi + menu6 + resetAnsi);
        System.out.println(boldAnsi + line + resetAnsi);

        int menuNo;
        do {
            System.out.print("> ");
            menuNo = keyboardScanner.nextInt();

            switch (menuNo) {
                case 1:
                    System.out.println("토지혜");
                    break;
                case 2:
                    System.out.println("아기♥");
                    break;
                case 3:
                    System.out.println("세상에서 제일 예뻐요. 완벽!");
                    break;
                case 4:
                    System.out.println("아지껍니다! 건들지 마세요! 물거예요!");
                    break;
                case 5:
                    System.out.println("우오아아아아아 신난다~ ㅎㅎ");
                    break;
                case 6:
                    System.out.println("용용이 끝끝.");
                    break;
                default:
                    System.out.println("번호를 제대로 선택해야 되요!.");
                    break;
            }

        } while (menuNo != 6);

        // 사용을 완료한 자원은 반환해야 다른 프로세스(프로그램)이 사용할 수 있다.
        // 단, JVM을 종료하면 JVM이 사용한 모든 자원은 강제 회수된다.
        // OS가 강제 회수한다.
        keyboardScanner.close();
    }
}
