package az.iktlab.group_j4.java_lessons.lesson_12;

public interface Ability {

    void write();

    default void read1() {
        System.out.println("Reading ability");
    }

    static Integer returnOne() {
        return 1;
    }
    // 50 methods
}
