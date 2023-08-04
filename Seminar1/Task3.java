package Seminar1;

/*
 Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
 Необходимо посчитать и вернуть сумму элементов этого массива.
 При этом накладываем на метод 2 ограничения:
 метод может работать только с квадратными массивами (количество строк равно кол-ву столбцов),
 и в каждой ячейки может лежать только значение 0 и 1.
 Если нарушается одно из условий, метод должен бросить RunTimeException с сообщением об ошибке.
 */
public class Task3 {

    public static void main(String[] args) {
        int[][] array = new int[][] { { 1, 0, 5 }, { 0, 1, 0 }, { 0, 0, 0 } };
        try {
            System.out.println("сумма элементов массива равна: " + sumArrayItem(array));
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        System.out.println("Конец работы приложения");
        

    }

    private static int sumArrayItem(int[][] array) {
        if (array == null) {
            throw new RuntimeException("Массив не инициализирован");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                throw new RuntimeException("Массив не квадратный");
            }
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Элемент с индексом [" + i + ", " + j + "]" +
                            " равен " + array[i][j] + ". Ожидается 0 или 1");
                }
                sum += array[i][j];
            }
        }
        return sum;
    }

}