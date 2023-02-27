package OOP.Homework4;

import java.util.Scanner;

public class Controller {
    public static void run(){
        Task t1 = new Task("Сделать домашнюю работу", "Арина", 1, "27.02");
        Task t2 = new Task();
        Task t3 = new Task("Приготовить ужин", "Арина", 2, "27.02");
        Task t4 = new Task("Сходить на работу", "Кирилл", 1, "27.02");
        Task t5 = new Task("Погладить кота", "Кирилл", 2, "27.02");
        Planner myP = new Planner();
        myP.add(t1);
        myP.add(t2);
        myP.add(t3);
        myP.add(t4);
        myP.add(t5);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        Add add = new Add(scanner);
        UserInterface userInterface = new UserInterface(scanner, menu, myP, add);
        userInterface.start();
    }
}
