package bitcamp.myapp;

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
        String menu1 = "1. 회원";
        String menu2 = "2. 프로젝트";
        String menu3 = "3. 게시판";
        String menu4 = "4. 도움말";
        String menu0 = "0. 종료";
        // 변수 선언
        // 특정 타입의 데이터를 저장할 수 있는 공간을 정의
        // 타입 변수명 = 값; // 값 초기화

        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTile + resetAnsi);
        System.out.println(menu1);
        System.out.println(menu2);
        System.out.println(menu3);
        System.out.println(menu4);
        System.out.println(boldAnsi + redAnsi + menu0 + resetAnsi);
        System.out.println(boldAnsi + line + resetAnsi);
        // 프린트 출력

        int menuNo;

        do {
            System.out.print("> ");
            menuNo = scanner.nextInt();
            // 스캐너 받음
            switch (menuNo) {
                case 1:
                    System.out.println("회원");
                    break;
                case 2:
                    System.out.println("프로젝트");
                    break;
                case 3:
                    System.out.println("게시판");
                    break;
                case 4:
                    System.out.println("도움말");
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("메뉴 번호가 옳지 않습니다.");
                    break;

            }
            // switch 특정 숫자 입력하여 결과값 출력
        } while (menuNo != 0);
        // do-while 문
        // 한번은 무조건 실행 후 거짓인지 참인지 판단 후 반복문 돌린다.

        scanner.close();
        // 프린트 닫음
    }
}
