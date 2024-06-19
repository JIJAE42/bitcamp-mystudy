package study.lang.string;

public class Test02 {
  public static void main(String[] args) {
    String s = "aaa"; // 상수 스트링 비교
    String s2 = "aaa"; // 스트링 리터럴만 보관하는 곳에서 주소를 가져옴 기존에 있으면 기존꺼 가져옴

    System.out.println(s == s2); // 레퍼런스에 들어 있는 값을 비교한다.
  }
}
