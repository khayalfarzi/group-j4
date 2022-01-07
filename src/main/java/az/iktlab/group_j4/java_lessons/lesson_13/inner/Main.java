package az.iktlab.group_j4.java_lessons.lesson_13.inner;


public class Main {

    public static void main(String[] args) {

        Person.Gender gender = Person.Gender.MALE;
        System.out.println(gender);

        Able able = new Able() {
            @Override
            public void read() {
                System.out.println("Anonymous read");
            }
        };
    }
}
