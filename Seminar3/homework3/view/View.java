package Seminar3.homework3.view;

import java.util.Scanner;

public class View {
    public String CreateUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user data in the following format: Surname Name Patronymic Birthday (dd.mm.yyyy)" +
                " PhoneNumber (10) Gender: ");
        return scanner.nextLine();
    }

    public void Exception(Exception e){
        Exception(e.getMessage());
    }

    public void Exception(String str){
        System.out.println(str);
    }
}
