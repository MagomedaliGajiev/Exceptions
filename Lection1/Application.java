package Lection1;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        // System.out.println(getFileSize(new File("123.txt")));
        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Divide by zero not permited");
        }
         return a / b;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
