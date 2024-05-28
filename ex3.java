public class ex3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        double c = a + b;
        int d = a + b;
        double e = 3.14234;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d%b);
        System.out.println("a x b = " + a*b);
        System.out.println(e+a+b+c);

        if (a >= 1) {
            System.out.println(d);
        } else if (a < 1) {
            System.out.println(e);
        } if (b > 20) {
            System.out.println("20보다 더 큰 b");
        }

        int aa = 20;
        int bb = 24;
        boolean student = false;
        boolean babo = false;

        if (aa < 18) {
            System.out.println("미성년자");
        } else {
                if (student) {
                    System.out.println("성인 학생");
                } else {
                    System.out.println("성인");
                }
            }
            if (bb > 20) {
                System.out.print("성인 ");
            }   if (babo) {
                System.out.println("바보");
            } else {
                System.out.println("천재");
            }
            }

        }

        