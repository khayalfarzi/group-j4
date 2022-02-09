package az.iktlab.group_j4.java_lessons.lesson_22;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void calculate() {
        System.out.println(age);
    }

    public void calculate(int e) {
        Person person = null;
        System.out.println(person.getAge());
    }

    @Override
    public String toString() {
        Person person = null;
        System.out.println(person.getAge());
        return "";
    }
}
