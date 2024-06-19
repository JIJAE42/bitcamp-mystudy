package study.lang.operator;

// 실습
// - 산술 연산자를 사용하여 연산을 수행한 후 결과를 확인하라.

// 학습 내용
// -byte, short, char를 산술연산할 때 int로 변환한 후 수행한다.
// - 같은 탕비끼리만 연산할 수 있다.
// - int와 int의 연산 결과는 int이다.
// - 다른 타입으로 변환하는 것을 '형변환(type casting)' 이라 한다.
//
//

public class Test02 {
  public static void main(String[] args) {
    byte b1 = 100;
    byte b2 = 20;
    byte b3 = (byte) (b1 + b2);

    System.out.println(b3);

    int r = b1 + b2;

    char c = 20;
    short s = 30;
    // short r2 = c + s;

    long i1 = 22_0000_0000; // l 안 붙이면 기본적으로 int 리터럴로 인식
    long i2 = 21_0000_0000;
    long i3 = i1 + i2;

    System.out.println(i3);

    long r3 = i1 + i2;
    System.out.println(r3);
  }
}
