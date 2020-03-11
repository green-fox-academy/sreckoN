package excercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {

        reverseLinesFromAFile();

    }

    public static void reverseLinesFromAFile() {
        Path filePath = Paths.get("/home/srecko/Desktop/greenfox/sreckoN/week-02/day-03/src/reversed-lines.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            List<String> decrypted = reverseLines(lines);
            for (String line : decrypted) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> reverseLines(List<String> lines) {
        List<String> reversed = new ArrayList<>();

        for (String line : lines) {
            String reversedLine = "";
            for (int i = line.length() - 1; i > 0 ; i--) {
                reversedLine += line.charAt(i);
            }
            reversed.add(reversedLine);
        }

        return reversed;
    }

}
