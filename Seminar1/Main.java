package Seminar1;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньшенекоторого заданного минимума, метод возвращает -1,
в качестве кода ошибки, иначе длину - массива.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 5, 3, 4, 6 };
        System.out.println(checkLength(array));
    }

    public static int checkLength(int[] array) {
        int minLength = 5;
        if (array.length < minLength) {
            return -1;
        }
        return array.length;
    }
}
