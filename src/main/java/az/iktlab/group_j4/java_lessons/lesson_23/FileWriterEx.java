package az.iktlab.group_j4.java_lessons.lesson_23;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {

        String path =
                "C:\\Users\\Khayal Farziyev\\IdeaProjects\\group-j4-git\\src\\main\\java\\az\\iktlab\\group_j4\\java_lessons\\lesson_23\\myFile.txt";

        File file = new File(path);

        try (FileWriter writer = new FileWriter(file)) {

            for (int i = 0; i < 55555; i++) {
                writer.write("Salam\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
