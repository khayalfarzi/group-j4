package az.iktlab.group_j4.java_lessons.lesson_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderEx {

    public static void main(String[] args) {
        String path =
                "C:\\Users\\Khayal Farziyev\\IdeaProjects\\group-j4-git\\src\\main\\java\\az\\iktlab\\group_j4\\java_lessons\\lesson_23\\myFile.txt";

        File file = new File(path);

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext())
                System.out.println(sc.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
