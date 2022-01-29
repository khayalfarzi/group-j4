package az.iktlab.group_j4.java_lessons.lesson_19;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = Loader.load();

        people.forEach(person -> {
            if (person.getId() == 1)
                System.out.println(person);
        });

        while (people.iterator().hasNext()) {
            if (people.iterator().next().getId() == 1) {
                System.out.println(people.iterator().next());
            }

            for (int i = 0; i < people.size(); i++) {
                if (people.get(i).getId() == 1)
                    System.out.println(people.get(i));
            }

            for (Person person : people)
                if (person.getId() == 1)
                    System.out.println(person);
        }
    }
}
