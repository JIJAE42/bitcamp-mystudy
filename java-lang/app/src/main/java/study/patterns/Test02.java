package study.patterns;

import study.patterns.step02.Sedan;

public class Test02 {

  public static void main(String[] args) {
    Sedan sonata = Sedan.create("소나타");
    Sedan k7 = Sedan.create("K7");

    System.out.println(sonata); //
    System.out.println(k7);
  }
}
