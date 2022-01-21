package az.iktlab.group_j4.java_lessons.lesson_17;

public class Main {

    public static void main(String[] args) {

        Generic<Integer> integerGeneric = new Generic<>();
        integerGeneric.read(23);

        Generic<String> stringGeneric = new Generic<>();
        stringGeneric.read("Hello Generics");

        Generic<Person> personGeneric = new Generic<>();
        personGeneric.read(new Person());
    }
}
