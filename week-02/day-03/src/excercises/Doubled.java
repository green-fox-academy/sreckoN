package excercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {

        decryptTheFile();

    }

    public static void decryptTheFile() {
        Path filePath = Paths.get("/home/srecko/Desktop/greenfox/sreckoN/week-02/day-03/src/duplicated-chars.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            List<String> decrypted = decryptLines(lines);
            for (String line : decrypted) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> decryptLines(List<String> lines) {
        List<String> finished = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String newLine = "";
            for (int j = 0; j < line.length(); j++) {
                if (j % 2 != 0) newLine += (line.charAt(j) + "");
            }
            finished.add(newLine);
        }

        return finished;
    }

}
