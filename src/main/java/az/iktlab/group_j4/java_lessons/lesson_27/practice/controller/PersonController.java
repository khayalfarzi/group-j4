package az.iktlab.group_j4.java_lessons.lesson_27.practice.controller;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Gender;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Person;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.service.PersonService;
import az.iktlab.group_j4.java_lessons.lesson_27.practice.util.Validator;

import java.util.List;
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

        System.out.print("Enter surname: ");
        String surname = sc.nextLine();
        person.setSurname(surname);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        person.setAge(age);

        System.out.print("Enter father name: ");
        String fn = sc.nextLine();
        person.setFatherName(fn);

        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        person.setGender(Validator.validateGender(gender));

        service.savePerson(person);
    }

    public List<Person> showPeople() {
        return service.showPeople();
    }
}
