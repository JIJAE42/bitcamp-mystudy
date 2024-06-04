package study.lang.variable;

public class Test01 {
  public static void main(String[] args) {
    byte b1 = -128;
    byte b2 = 127;

    short s1 = -32768;
    short s2 = 32767;

    int i1 = -21_4748_3648;
    int t2 = 21_4748_3647;

    long l1 = -922_3372_0368_5477_5808L;
    long l2 = 922_3372_0368_5477_5807L;


    System.out.println(Byte.MAX_VALUE);
    System.out.println(Byte.MIN_VALUE);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Short.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Long.MIN_VALUE);
    System.out.println(Float.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);
    System.out.println(Double.MAX_VALUE);
    System.out.println(Double.MIN_VALUE);
  }
}
