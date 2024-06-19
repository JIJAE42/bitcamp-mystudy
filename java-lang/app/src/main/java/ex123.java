
public class Printer {
    // 메시지를 출력하는 메서드, 반환값 없음
    public static void printMessage(String message) {
        System.out.println(message);
    }
}

public class Test {
    public static void main(String[] args) {
        Printer.printMessage("Hello, World!"); // printMessage 메서드 호출
        // 출력: Hello, World!
    }
}
