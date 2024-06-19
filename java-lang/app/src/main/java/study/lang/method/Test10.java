package study.lang.method;

public class Test10 {
  public static void main(String[] args) {
    int[] values;
    values = create();

    System.out.println(values.length);

  }

  static int[] create() {
    int[] ar = new int[] {100, 200, 300, 400};
    return ar;
  }
}
