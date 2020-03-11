package optionalExcercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {

    public static void main(String[] args) {

        int year = yearWithMostBirthdays("/home/srecko/Desktop/greenfox/sreckoN/week-02/day-03/src/births.csv");
        System.out.println(year);

    }

    public static int yearWithMostBirthdays(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            List<String> dataLines = Files.readAllLines(filePath);
            return getYearFromLines(dataLines);
        } catch (IOException e) {
            System.out.println("Non-existing file.");
            return 0;
        }
    }

    private static int getYearFromLines(List<String> dataLines) {
        Map<Integer, Integer> years = new HashMap<>();

        for (String line : dataLines) {
            int year = Integer.parseInt(line.split(";")[1].split("-")[0]);
            if (years.containsKey(year)) years.put(year, years.get(year) + 1);
            else years.put(year, 0);
        }

        int max = 0;
        int year = 0;

        for (Integer key : years.keySet()) {
            if (years.get(key) > max) {
                max = years.get(key);
                year = key;
            }
        }

        return year;
    }

}
