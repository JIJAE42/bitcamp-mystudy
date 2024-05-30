public class Test7 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Arguments passed to the program:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No arguments were passed to the program.");
        }
    }
}
