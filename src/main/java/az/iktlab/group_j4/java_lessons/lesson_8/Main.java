package az.iktlab.group_j4.java_lessons.lesson_8;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Khayal";
        p.surname = "Farziyev";
        p.age = 123;

        System.out.println(p);

        Person p1 = new Person();
        p1.name = "Nicat";
        p1.surname = "Guliyev";
        p1.age = 124;
        System.out.println(p1);
        System.out.println(p1.name);

//        Person p = new Person();
    }
}
