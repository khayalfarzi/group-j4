package az.iktlab.group_j4.java_lessons.lesson_13.inner;

public class Person {

    private String name;
    private String surname;
    private Gender gender;

    public enum Gender {

        MALE(1), FEMALE(0);

        private final int value;

        Gender(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
