package Seminar3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task3_1 {
    public void rwLine(Path pathRead, Path pathWrite) {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
                BufferedWriter out = Files.newBufferedWriter (pathWrite)) {
                    out.write(in.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
