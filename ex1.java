public class ex1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = (a + b); // 덧셈
        int diff = b - a; // 뺄셈
        double product = a * b; // 곱셈
        double quotient = b / a; // 나눗셈
        int remainder = b % a; // 나머지

        System.out.println("Sum: " + sum); // 출력: Sum: 15
        System.out.println("Difference: " + diff); // 출력: Difference: 5
        System.out.println("Product: " + product); // 출력: Product: 50
        System.out.println("Quotient: " + quotient); // 출력: Quotient: 2
        System.out.println("Remainder: " + remainder); // 출력: Remainder: 0
        boolean isRaining = false;
         if (isRaining) {
        System.out.println("Bring an umbrella!");
        } else {
        System.out.println("Enjoy the sunny weather!");
        }     
    }
}

