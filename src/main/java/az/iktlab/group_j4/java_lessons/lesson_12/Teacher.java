package az.iktlab.group_j4.java_lessons.lesson_12;

public class Teacher implements Ability {

    @Override
    public void write() {
        System.out.println("Teacher is writing");
    }

    public void  read(){
        System.out.println("Teacher is reading");
    }

    @Override
    public void read1() {
        System.out.println("Teacher is reading 1");
    }
}
