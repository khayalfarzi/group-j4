package az.iktlab.group_j4.java_lessons.lesson_12.pre_step;

public class Human {

    public Human() {
        System.out.println("Default constructor");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human finalize method");
    }
}
