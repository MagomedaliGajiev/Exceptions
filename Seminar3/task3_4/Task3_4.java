package Seminar3.task3_4;

/*
1.Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение об ошибке.
2.Создайте класс исключений, которое будет возникать при обращении к
пустому элементу в массиве ссылочного типа. Исключение должно
отображать понятное для пользователя сообщение об ошибке.
3.Создайте класс исключения, которое будет возникать при попытке открыть
несуществующий файл. Исключение должно отображать понятное для
пользователя сообщение об ошибке.
 */
public class Task3_4 {
    public static void main(String[] args) {
        double a = 6;
        double b = 0;

        try {
            System.out.println(calculate(a, b));
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculate(double a, double b) {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль невозможно");
        }
        return a/ b;
    }
    
}