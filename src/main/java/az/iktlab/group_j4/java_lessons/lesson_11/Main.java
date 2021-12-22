package az.iktlab.group_j4.java_lessons.lesson_11;

public class Main {

    public static void main(String[] args) {

        Human h = new Human();
        h.setName("N 1");
        h.setSurname("SN 1");
        h.setAge(11);
        System.out.println(h.getClass());

        System.out.println(h);

        Person p = new Person();
        p.setName("Person name 1");

        System.out.println(p.hashCode());

        Employee e = new Employee();
        e.setName("Employee name 1");
        e.setGender("Male");

        System.out.println(e);

        Teacher teacher = new Teacher();
        teacher.read();
    }
}
