package Seminar3.homework3;

import Seminar3.homework3.controller.UserController;
import Seminar3.homework3.model.User;
import Seminar3.homework3.view.View;

public class Main {
    public static void main(String[] args) {
        User model = new User();
        View view = new View();
        UserController controller = new UserController(model, view);
        controller.CreateUser();
    }
}
