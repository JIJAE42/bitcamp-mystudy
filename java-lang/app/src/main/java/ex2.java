// 실습
// - 애플리케이션 아규먼트를 다음과 같이 결과가 나오도록 모두 출력하라.
// $ java -classpath ... Test6 aaa bbb ccc ddd
// 'aaa'
// 'bbb'
// 'ccc'
// 'ddd'

public class ex2 {

  public static void main(String[] args) {
    int i = 5;
    System.out.print(args[i]);
    System.out.print("5번째이다");
  }
}
