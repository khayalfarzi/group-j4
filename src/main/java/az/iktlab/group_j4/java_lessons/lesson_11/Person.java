package az.iktlab.group_j4.java_lessons.lesson_11;

public class Person extends Human {

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void read() {
        System.out.println("Person is reading");
    }

}