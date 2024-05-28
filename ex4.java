public class ex4 {
    public static void main(String[] args) {
        int age = 15;
        double b = 165.2;
        boolean student = true;
        boolean drive = false;

        if (age > 13) {
            System.out.print("a는 14살 이상이고 ");
        }  if (student) {
                System.out.print("학생이며 ");
            } else {
                System.out.print("학생이 아니며 ");
            }
         if (b >= 170) {
            System.out.print("키가 170이상이고 ");
        } else {
            System.out.print("키가 170미만이고 ");
        } if (drive) {
            System.out.print("운전을 하고 있고 ");
        } if (student) {
                System.out.print("교복을 입고 있다");
            } else {
                System.out.print("교복을 안 입고 있다");
            }

        } 
        }