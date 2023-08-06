package Lection3.gui;

import java.io.FileWriter;
import java.io.IOException;

public class SaveSevice {
    public void save() {
        System.out.println("save document started...");
        try (FileWriter writer = new FileWriter("test1.txt")) {
            throw new IOException("operation failed"); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
