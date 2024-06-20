package bitcamp.myapp2;

import java.nio.charset.Charset;

public class App {
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset());

        byte[] bytes = {
                (byte)0xb0, (byte)0xa1,
        };
    }
    }
