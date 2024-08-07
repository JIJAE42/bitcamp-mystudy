package study.lang.operator;

// 실습
// - 산술 연산자를 사용하여 연산을 수행한 후 결과를 확인하라.
//
// 학습 내용
// - 연산자 우선순위
// 1) *, /, %
// 2) +, -
// -우선 순위가 같은 우, 먼저 나온 연산자를 먼저 계산한다.


public class Test04 {
  public static void main(String[] args) {
    int r = 3 + 5 * 8;
    int r2 = 5 * 2 + 3;

    System.out.println(3 + 5 * 8);
    System.out.println(5 * 2 + 3);
    System.out.println((5 + 2) * 3);

    // 암시적 형변환 + 연산자 우선순위
    System.out.println(3.2f + 5 / 2l);

    // 명시적 형변환 + 연산자 우선순
    System.out.println(3.2f + 5f / 2l);



  }
}
