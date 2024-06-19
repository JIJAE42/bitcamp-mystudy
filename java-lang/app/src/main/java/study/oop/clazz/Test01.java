package study.oop.clazz;

import study.oop.clazz.util.Calculator;

public class Test01 {

  public static void main(String[] args) {

    // study.oop.clazz.util.Calculator c1 = new study.oop.clazz.util.Calculator();

    Calculator c1 = new Calculator();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);
    System.out.printf("result = %d\n", c1.result);

    c1.clear();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);
    System.out.printf("result = %d\n", c1.result);
  }
}
