package streamExercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> even = numbers.stream().filter((num) -> num % 2 == 0).collect(Collectors.toList());
    List<Integer> squared = numbers.stream().map((s) -> s * s).collect(Collectors.toList());

    List<Integer> numbers1 = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> squaredBiggerThanTwenty = numbers1.stream().map((s) -> s * s).filter((n) -> n > 20).collect(Collectors.toList());

    double avg = numbers.stream().filter((n) -> n % 2 != 0).mapToInt(Integer::intValue).average().getAsDouble();

    List<Integer> numbers2 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    int sumOfOdd = numbers.stream().filter((n) -> n % 2 != 0).mapToInt(Integer::intValue).sum();

    List<String> strChars = new ArrayList<>(Arrays.asList("sGkdjFIKFslfdkI Kfd;F".split("(?!^)")));
    List<String> capitals = strChars.stream().filter((s) -> !s.equals(s.toLowerCase())).collect(Collectors.toList());

    List<String> startWith = getThoseThatStart("A");
  }

  public static List<String> getThoseThatStart(String prefix) {
    return Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS").stream().filter((s -> s.startsWith(prefix))).collect(Collectors.toList());
  }

  public static int countCharFrequency(List<Character> chars, char c) {
    final Character character = Character.valueOf(c);
    return (int) chars.stream().filter((s) -> s == character).count();
  }

  public static void printHundredMostCommonWords(String filename) {
    List<String> lines = readFile(filename);
    
  }

  private static List<String> readFile(String filename) {
    try {
      Path filepath = Paths.get(filename);
      List<String> lines = Files.readAllLines(filepath);
      return lines;
    } catch (IOException e) {
      return null;
    }
  }
}
