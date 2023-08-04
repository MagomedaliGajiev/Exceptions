package Seminar1;

import java.util.Scanner;

/*
 Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
 Метод ищет в массиве заданное значение и возвращает его индекс. При этом например:
 если длина массива меньше некоторого заданного минимума, метод возвращает -1,
 в качетве кода ошибки.
 Если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 Если вместо массива пришел null, метод вернет -3
 Придемайте свои варианты исключительных ситуаций и верните соответсвующие коды ошибок.
 Напишете метод, в котором реализовано взаимодействие с пользователем.
 То есть, метод запросит искомое число у пользователя, вызовет первый,
 обработает вызываемое значение и покажет читаемый результат пользователю.
 Например, если вернулся -2, пользователю выдается сообщение: "Искомы элемент не найден" 
 */
public class Task2 {

    public static void main(String[] args) {
        int[] array = new int[]{22,6,3,4,-5,0};
        dialog(array);
    }

    private static void dialog(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое значение: ");
        int value = scanner.nextInt();
        int code = checkArray(array, value);
        parse(code);
    }

    private static void parse(int code) {
        switch (code) {
            case -1:
                System.out.println("Длина массива меньше минимального");
                break;
            
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Массив не инициализирован");
                break;
            default:
                System.out.println("Индекс искомого элемена равен: " + code);
                break;
        }
    }

    private static int checkArray(int[] array, int value) {
        if (array == null) {
            return -3;
        }
        int minLength = 5;
        if (array.length < minLength) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -2; 
    }
    
}
