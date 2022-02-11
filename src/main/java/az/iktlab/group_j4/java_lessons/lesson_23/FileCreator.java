package az.iktlab.group_j4.java_lessons.lesson_23;

import java.io.File;
import java.io.IOException;

public class FileCreator {

    public static void main(String[] args) {

        String path =
                "C:\\Users\\Khayal Farziyev\\IdeaProjects\\group-j4-git\\src\\main\\java\\az\\iktlab\\group_j4\\java_lessons\\lesson_23\\myFile.txt";
        File file = new File(path);

        try {
            if (!file.exists()) {
                boolean isCreated = file.createNewFile();
                System.out.println("File successfully created");
            } else System.out.println("File is exist");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.getAbsolutePath());
    }
}
