package Seminar3;

import java.io.IOException;

/*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий
значение внутренней int переменной на 1. Сделайте так, чтобы с объектом
такого типа можно было работать в блоке try with resources. Нужно бросить
исключение, если работа с объектом типа счетчик была не в ресурсном try
и/ или ресурс остался открыт. Подумайте какой тип исключения подойдет
лучше всего.
 */
public class Task3_3 {
    public static void main(String[] args) {
        System.out.println(extracted());
    }

    private static int extracted() {
        try (Counter counter = new Counter()){
            counter.add();
            counter.add();
            return counter.getCount();
        } catch (IOException e){
            e.printStackTrace();
        }
        return 0;
    }
}