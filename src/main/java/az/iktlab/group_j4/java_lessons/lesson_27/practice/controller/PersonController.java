package az.iktlab.group_j4.java_lessons.lesson_27.practice.controller;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Person;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.service.PersonService;

import java.util.Scanner;

public class PersonController {

    private final Scanner sc = new Scanner(System.in);

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    public void savePerson() {

        Person person = new Person();

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        person.setName(name);
        // fill fields

        service.savePerson(person);
    }
}
