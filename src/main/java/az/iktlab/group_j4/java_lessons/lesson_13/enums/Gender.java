package az.iktlab.group_j4.java_lessons.lesson_13.enums;

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
