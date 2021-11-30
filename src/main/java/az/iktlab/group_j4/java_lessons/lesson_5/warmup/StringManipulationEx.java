package az.iktlab.group_j4.java_lessons.lesson_5.warmup;

import java.util.Scanner;

public class StringManipulationEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String formattedStr = word.replace("x", " ").trim().replace(" ", "x");
        System.out.println(formattedStr);

//        int begin=-1,end=-1;
//        char[] chars = word.toCharArray();
//        for (int i = 0; i < chars.length; i++){
//            if (chars[i] != 'x'){
//                if (begin<0){
//                    begin = i;
//                }
//                if (begin>=0){
//                    end = i;
//                }
//            }
//        }
//        System.out.println(word.substring(begin,end+1));
    }
}
