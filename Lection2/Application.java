package Lection2;

import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        int number = 1;
        try {
            // number = 10 / 0;
            String test = null;
            // System.out.println(test.length());
            Collections.emptyList().add(new Object());
        } catch (ArithmeticException e) {
            System.out.println("Operation devide by zero not suported");
        } catch (NullPointerException e) {
            System.out.println("nullpointer exception");
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println(number); 
    }
}
