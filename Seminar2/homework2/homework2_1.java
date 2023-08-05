package Seminar2.homework2;

import java.util.Scanner;

/*
 Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 вместо этого, необходимо повторно запросить у пользователя ввод данных
 */
public class Homework2_1 {
    public static void main(String[] args) {
        float number = getFloat();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите дробное число: ");
        while (!sc.hasNextFloat()) {
            System.out.print("Ошибка ввода! Введите дробное число: ");
            sc.next();
        }
        float number = sc.nextFloat();
        sc.close();
        return number;
    }
    
}