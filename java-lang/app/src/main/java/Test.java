// 실습
// - A, B, C 클래스를 정의한 후 컴파일 하라!
// - 컴파일 후 생성된 파일을 확인하라.
//
// 결과 및 설명
// - A.class, B.class, C.class 가 생성된다.
// - 자바 컴파일러는 클래스 블록 당 .class 파일을 만든다.
// - .class 파일의 이름은 클래스 이름과 같다.

// class A {
// }

// class B {
// }

// class C {
// }

class Test {
  public static void main(String[] args) {
    long value = 0x1a1b1c1d2a2b2c2dL;

    print((int)value >> 56);
    print((int)(value >> 56));
  }

  static void print(int a) {
    System.out.printf("%016x\n", a);
  }
}