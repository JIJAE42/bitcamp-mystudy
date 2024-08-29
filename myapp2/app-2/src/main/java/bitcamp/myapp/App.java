package bitcamp.myapp;

public class App {
    public static void main(String[] args) {

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
    }
}
