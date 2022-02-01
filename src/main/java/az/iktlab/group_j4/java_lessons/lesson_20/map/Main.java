package az.iktlab.group_j4.java_lessons.lesson_20.map;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Person> people = Loader.load();
        int id = sc.nextInt();

        people.forEach(person -> {
            if (person.getId() == id)
                System.out.println("List: " + person);
        });

        Map<Integer, Person> map = Loader.loadMap();
        System.out.println("Map: " + map.get(id));

//        Map<Integer, String> map = new HashMap<>();
//        map.put(2, "N1");
//        map.put(2, "N2");
//        map.put(1, "N3");
//        System.out.println(map);
    }
}
