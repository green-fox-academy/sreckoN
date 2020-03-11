package exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {

    public static void main(String[] args) {



    }

    public static void writeToAFile(String path, String word, int num) {
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            lines.add(word);
        }
        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
