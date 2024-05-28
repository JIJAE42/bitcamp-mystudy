public class ex2 {
    public static void main(String[] args) {
        double num1 = 10; // 정수 10이 표현하는 값이 더 넓은 double로 변환
        // int num2 = 3.14;
        double num3 = 7.0f + 3.14;  // 7.0f의 float형 데이터가 double로 변환

        System.out.println(num1);
        System.out.println(num3);

         int num4 = 1; 
         int num5 = 4;

        double result1 = num4 / num5; 

        double result2 = (double) num4 / num5; 

        System.out.println(result1); // 0.25이나 선언이 int로 되어있어서 0.0으로 나옴, 선언 2개중 하나를 double로 바꿔야함

        System.out.println(result2); // 0.25
        }
    }
    
