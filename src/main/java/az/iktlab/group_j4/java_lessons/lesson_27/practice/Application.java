package az.iktlab.group_j4.java_lessons.lesson_27.practice;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.controller.PersonController;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.PersonDao;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.service.PersonService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        PersonDao personDao = new PersonDao();
        PersonService personService = new PersonService(personDao);
        PersonController personController = new PersonController(personService);

        while (true) {
            System.out.println("Commands: \n" +
                    "sp - Save person\n" +
                    "ru - Register user\n" +
                    "shp - Show people\n" +
                    "exit - Close program\n");
            System.out.print("Enter command: ");
            String command = sc.nextLine();

            switch (command) {
                case "sp":
                    personController.savePerson();
                    break;
                case "exit": {
                    System.out.println("Yaxsi yol");
                    return;
                }
            }
        }
    }
}
