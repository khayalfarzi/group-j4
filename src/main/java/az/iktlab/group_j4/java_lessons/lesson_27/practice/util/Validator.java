package az.iktlab.group_j4.java_lessons.lesson_27.practice.util;

import az.iktlab.group_j4.java_lessons.lesson_27.practice.model.Gender;

public class Validator {

    public static Gender validateGender(String gender) {
        try {
            if (gender.equals("MALE"))
                return Gender.MALE;
            else if (gender.equals("FEMALE"))
                return Gender.FEMALE;
            else throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Enter valid gender name. (example: MALE/FEMALE)");
        }
        return null;
    }

    public static void checkPersonName(String name) {

        if (name.length() < 3)
            System.out.println("Person name can't be less than 3");
    }
}
