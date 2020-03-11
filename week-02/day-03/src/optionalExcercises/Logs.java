package optionalExcercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static void main(String[] args) {

        List<String> data = readData();

        /*String[] ips = getUniqueIPAddresses(data);

        for (String ip : ips) {
            System.out.println(ip);
        }*/

        System.out.println("Ratio: " + getPostRatio(data));

    }

    private static List<String> readData() {
        Path filePath = Paths.get("/home/srecko/Desktop/greenfox/sreckoN/week-02/day-03/src/log.txt");
        List<String> dataLines;
        try {
            dataLines = Files.readAllLines(filePath);
            return dataLines;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Write a function that returns an array with the unique IP adresses.
    public static String[] getUniqueIPAddresses(List<String> lines) {
        ArrayList<String> ips = new ArrayList<>();

        for (String line : lines) {
            String[] words = line.split("   ");
            String ip = words[1];
            if (!ips.contains(ip)) ips.add(ip);
        }

        return ips.toArray(new String[ips.size()]);
    }

    // Write a function that returns the GET / POST request ratio.
    public static double getPostRatio(List<String> lines) {
        int countGet = 0;
        int countPost = 0;

        for (String line : lines) {
            String[] words = line.split("   ");
            String instruction = words[2].split(" ")[0];
            if (instruction.equals("GET")) countGet++;
            else countPost++;
        }

        return (double) countGet / countPost;
    }

}
