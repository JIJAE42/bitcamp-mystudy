package study.lang.literal;

public class Test07 {
  public static void main(String[] args) {
    int sum = 0;
    for (int num = 1; num <= 100; num++) {
      sum += num;
    }
    System.out.println("for문 1부터 100까지 합:  " + sum);
  }
}
