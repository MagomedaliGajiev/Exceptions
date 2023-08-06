package Lection3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("123.txt");
                FileWriter writer = new FileWriter("test.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }

        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
    }
}
