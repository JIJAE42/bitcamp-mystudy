package bitcamp.myapp;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요:");
        String str2 = scanner.nextLine();

        System.out.println("학생은 " + str2);
    }
}

