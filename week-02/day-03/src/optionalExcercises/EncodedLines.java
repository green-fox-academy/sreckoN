package optionalExcercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {

        caesarCypher();

    }

    public static void caesarCypher() {
        Path filePath = Paths.get("/home/srecko/Desktop/greenfox/sreckoN/week-02/day-03/src/encoded-lines.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            List<String> done = decrypt(lines);
            for (String line : done) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> decrypt(List<String> lines) {
        List<String> decrypted = new ArrayList<>();

        for (String line : lines) {
            String newLine = "";
            for (int i = 0; i < line.length(); i++) {
                int character = line.charAt(i);
                if (character == ' ') {
                    newLine += " ";
                    continue;
                } else {
                    newLine += (char) (character - 1) + "";
                }
            }
            decrypted.add(newLine);
        }

        return decrypted;
    }


}
