package Seminar2.homework2;

import java.util.Scanner;

/*
 Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Homework2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        try {
            if (str.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            } else {
                System.out.println("Вы ввели: " + str);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}