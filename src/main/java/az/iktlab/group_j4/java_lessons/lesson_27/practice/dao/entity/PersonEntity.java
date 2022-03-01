package az.iktlab.group_j4.java_lessons.lesson_27.practice.dao.entity;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Gender;

import java.util.Objects;

public class PersonEntity {

    private Long id;
    private String name;
    private String surname;
    private String fatherName;
    private int age;
    private Gender gender;

    public PersonEntity() {
    }

    public PersonEntity(Long id, String name, String surname, String fatherName, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        PersonEntity that = (PersonEntity) o;
        return age == that.age && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(fatherName, that.fatherName) && gender == that.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, fatherName, age, gender);
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
