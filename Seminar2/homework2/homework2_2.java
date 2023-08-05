package Seminar2.homework2;

/*
 Если необходимо, исправьте данный код
 (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */
public class Homework2_2 {
    public static void main(String[] args) {
        int[] intArray = new int[] {33,76767,655,7677,778,877,0,655,667,7665,76632};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
    
}