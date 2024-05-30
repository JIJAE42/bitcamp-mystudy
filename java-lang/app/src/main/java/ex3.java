public class ex3 {

    public static void main(String[] args) {
        for (int i = 0; args.length > i; i++) {
            System.out.println(args[i]);
        }
        if (args.length > 3) {
            System.out.println("4개 보다 크다");
        } else {
            System.out.println("4개 보다 작다");
        }
    }
}