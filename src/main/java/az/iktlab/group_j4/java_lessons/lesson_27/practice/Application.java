package az.iktlab.group_j4.java_lessons.lesson_27.practice;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.controller.PersonController;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.repo.PersonDao;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.repo.StartupLoaderDao;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.service.PersonService;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.util.CommandLineHelper;

import java.sql.SQLException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws SQLException {

        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        PersonDao personDao = new PersonDao();
        PersonService personService = new PersonService(personDao);
        PersonController personController = new PersonController(personService);
        StartupLoaderDao startupLoaderDao = new StartupLoaderDao();

        startupLoaderDao.createTables();

        while (true) {

            CommandLineHelper.showMenuBar();

            System.out.print("Enter command: ");

            String command = sc.nextLine();

            switch (command) {
                case "sp":
                    personController.savePerson();
                    break;
                case "shp":
                    System.out.println(personController.showPeople());
                    break;
                case "exit": {
                    System.out.println("Yaxsi yol");
                    return;
                }
            }
        }
    }
}
