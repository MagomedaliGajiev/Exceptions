package Lection3.gui;

import java.io.IOException;

public class SavedException extends IOException {
    public SavedException(String message, Exception e) {
        super(message, e);
    }
}
