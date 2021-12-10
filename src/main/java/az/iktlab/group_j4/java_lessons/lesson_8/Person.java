package az.iktlab.group_j4.java_lessons.lesson_8;

public class Person {

    public String name;

    public String surname;

    public byte age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
