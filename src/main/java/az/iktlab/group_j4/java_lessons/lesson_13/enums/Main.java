package az.iktlab.group_j4.java_lessons.lesson_13.enums;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(GenderClazz.MALE);

        System.out.println(Gender.FEMALE);
        System.out.println(Gender.FEMALE.getValue());
        System.out.println(Gender.FEMALE.name());

        System.out.println("========================");

        for (Gender gender : Gender.values())
            System.out.println(gender.getValue());

        System.out.println("========================");

        for (int i = 0; i < Gender.values().length; i++) {
            System.out.println(Gender.values()[i] + " = " + i);
        }

        System.out.println("========================");

        System.out.println(Arrays.toString(Gender.values()));
    }
}