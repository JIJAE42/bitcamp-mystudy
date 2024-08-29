package bitcamp.myapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 키보드 입력

        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";
        //Ansi 이스케이프 문자 사용

        String appTile = "[팀 프로젝트]";
        String line = "-----------";
        // 변수 선언
        // 특정 타입의 데이터를 저장할 수 있는 공간을 정의
        // 타입 변수명 = 값; // 값 초기화

        String[] menus = new String[] {
                "회원",
                "프로젝트",
                "게시판",
                "도움말",
                "종료",
        };
        // 문자 배열 사용

        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTile + resetAnsi);

        for (int i = 0; i < menus.length; i++) {
            if(menus[i].equals("종료")) {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + resetAnsi), (i + 1), menus[i], resetAnsi);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }
        // for 반복문 출력 메뉴 길이 만큼 까지 반복
        // 메뉴에 종료라면 if 출력 그외 메뉴는 else 출력
        // printf 사용하여 문자열의 출력 포맷을 제어

        System.out.println(boldAnsi + line + resetAnsi);
        // 프린트 출력

        int menuNo;

        while (true) {
            try {
                System.out.print("> ");
                menuNo = scanner.nextInt();

                if (menuNo >= 1 && menuNo <= menus.length) {
                    if (menus[menuNo - 1] == "종료") {
                        break;
                    }
                    System.out.println(menus[menuNo - 1]);
                } else {
                    System.out.println("메뉴 번호가 옳지 않습니다.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("숫자로 메뉴 번호를 입력하세요.");
                scanner.next();
            }
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
}
