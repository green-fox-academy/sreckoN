package excercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {

        reverseLinesFromAFile();

    }

    public static void reverseLinesFromAFile() {
        Path filePath = Paths.get("/home/srecko/Desktop/greenfox/sreckoN/week-02/day-03/src/reversed-order.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            reverse(lines);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void reverse(List<String> lines) {
        for (int i = 0; i < (lines.size() / 2); i++) {
            String temp = lines.get(i);
            int index = lines.size() - 1 - i;
            lines.set(i, lines.get(index));
            lines.set(index, temp);
        }
    }

}
