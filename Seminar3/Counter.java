package Seminar3;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private int count;
    private boolean opened;

    public Counter() {
        opened = true;
    }

    public void add() throws IOException {
        if (!opened) {
            throw new IOException("ресурс закрыт");
        }
        count++;
    }

    public boolean isOpened() {
        return opened;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() {
        opened = false;
        System.out.println("ресурс закрыли");
    }

}
