package Lection2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("123.txt");
            // test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally end");
        }
    }
}
