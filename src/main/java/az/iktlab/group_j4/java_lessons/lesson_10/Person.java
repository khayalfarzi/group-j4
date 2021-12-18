package az.iktlab.group_j4.java_lessons.lesson_10;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        if (age > 0)
            this.age = age;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Age can not be negative");
        else
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3)
            System.out.println("Name length can not be less than 3");
        else
            this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
