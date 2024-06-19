import java.util.Scanner;

public class InputExample {
  public static void main(String[] args) {
    // Scanner 객체 생성
    Scanner keyboardScanner = new Scanner(System.in);

    // 문자열 입력 받기
    System.out.print("이름을 입력하세요: ");
    String name = keyboardScanner.nextLine();
    System.out.println("입력된 이름: " + name);

    // 정수 입력 받기
    System.out.print("나이를 입력하세요: ");
    int age = keyboardScanner.nextInt();
    System.out.println("입력된 나이: " + age);

    // Scanner 닫기
    keyboardScanner.close();
  }
}
