package az.iktlab.group_j4.java_lessons.lesson_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AzePeople {
    public static void main(String[] args) {
        System.out.println(renderAges());
    }

    public static List<Integer> renderAges() {
        List<Integer> ages = new ArrayList<>();
        for (int i = 0; i < 151; i++) {
            ages.add(0);
        }

        List<Integer> rndP = loadRndPeople();
        for (int i = 0; i < rndP.size(); i++) {
            int cnt = rndP.get(i) + 1;
            ages.set(rndP.get(i), cnt);
        }
        return ages;
    }

    public static List<Integer> loadRndPeople() {
        System.out.println("Rnd start");
        Random random = new Random();
        List<Integer> peopleAge = new ArrayList<>();
        int i = 1;

        while (i < 10_000_000) {
            peopleAge.add(random.nextInt(149));
            i++;
        }
        System.out.println("Rnd end");
        return peopleAge;
    }
}
