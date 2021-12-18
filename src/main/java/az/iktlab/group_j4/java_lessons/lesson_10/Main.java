package az.iktlab.group_j4.java_lessons.lesson_10;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Khayal");
        person.setSurname("Farziyev");
        person.setAge(12);
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        Person person1 = new Person();
        person1.setName("KH");
        person1.setSurname("Farziyev 1");
        person1.setAge(-12);
        System.out.println(person1);
        System.out.println(person1.getName());
        System.out.println(person1.getSurname());
        System.out.println(person1.getAge());

        Person person2 = new Person("Kh", "FA", -12);
        System.out.println(person2);
    }
}
