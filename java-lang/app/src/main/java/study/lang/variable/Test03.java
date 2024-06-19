package study.lang.variable;

public class Test03 {
  public static void main(String[] args) {


    int[][] arr = new int[3][];
    arr[0] = new int[] {30, 31, 32, 33, 34};
    arr[1] = new int[] {30, 31, 32, 33};
    arr[2] = new int[] {30, 31, 32, 33, 34, 35};

    System.out.println(arr.length);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + ",");
      }
      System.out.println();
    }


    int[][] arr2 = new int[3][4];
    arr2[0] = new int[] {30, 31, 32, 33, 34};
    arr2[1] = new int[] {30, 31, 32, 33};
    arr2[2] = new int[] {30, 31, 32, 33, 34, 35};

    System.out.println(arr2.length);
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[i].length; j++) {
        System.out.print(arr2[i][j] + ",");
      }
      System.out.println();
    }
  }

}

