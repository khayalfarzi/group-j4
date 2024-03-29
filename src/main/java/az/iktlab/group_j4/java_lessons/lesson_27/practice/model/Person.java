package az.iktlab.group_j4.java_lessons.lesson_27.practice.model;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String fatherName;
    private int age;
    private Gender gender;

    public Person() {
    }

    public Person(String name, String surname, String fatherName, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(fatherName, person.fatherName) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, fatherName, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}