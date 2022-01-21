package az.iktlab.group_j4.java_lessons.lesson_17;

import java.util.ArrayList;
import java.util.List;

public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 45);
        list.add(1, 32);
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("String");
        list1.add(12);
        list1.add(true);

        System.out.println(list1);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(24);
//        integerList.add("hcghj");
    }
}
