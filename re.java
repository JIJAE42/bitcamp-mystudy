import java.time.LocalDate;

public class re {
    
    public static void main(String[] args) {
        System.out.print(7); // 123123123
        System.out.println(3); /*werwer
        werwer
        wer
        wer
        wer
        wer
         */
        //werwerwerwe
        /*
        123123
        123
        123
        //123123123
        123
         */
        System.out.println(3.14);
        System.out.println("자바!");
        System.out.println("문자열끼리의" + "연결도 가능합니다.");
        System.out.println("숫자" + 3 + "과 문자열의 연결도 가능합니다.");
        System.out.print(7);
        System.out.println("+" + 3);
        System.out.println("sdfsdf+3+3+3");

        LocalDate today = LocalDate.now();
        System.out.println("올해는"+today.getYear()+"년입니다.");

        LocalDate otherDay = today.withYear(1982);
        System.out.println("올해는" + otherDay.getYear() + "년입니다.");

        int num1 = 8, num2 = 4;

        System.out.println("+연산자:"+(num1+num2));

    }
}
