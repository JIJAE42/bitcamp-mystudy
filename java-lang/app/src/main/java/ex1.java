public class ex1 {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("하나 이상이다");
            for (int i = 0; args.length > i; i++) {
                System.out.println(args[i]);
            }
        } else {
            System.out.println("없다");
        }
    }
}