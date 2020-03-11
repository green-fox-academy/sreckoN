package exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        //countLinesInAFile();

    }

    public static int countLinesInAFile(String fileName) {
        Path filePath = Paths.get(fileName);
        int counter = 0;
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                counter++;
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return counter;
    }

}
