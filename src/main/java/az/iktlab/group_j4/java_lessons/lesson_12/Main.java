package az.iktlab.group_j4.java_lessons.lesson_12;

public class Main {

    public static void main(String[] args) {

        Ability teacher = new Teacher();
        teacher.write();
//        teacher.rea
        teacher.read1();
        System.out.println(Ability.returnOne());

        Ability student = new Student();
        student.write();
        student.read1();

        Teacher teacher1= new Teacher();
        teacher1.write();
        teacher1.read();
    }
}
