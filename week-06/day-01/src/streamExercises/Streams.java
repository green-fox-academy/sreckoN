package streamExercises;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    List<Integer> even = numbers.stream()
        .filter((num) -> num % 2 == 0)
        .collect(Collectors.toList());

    List<Integer> squared = numbers.stream()
        .map((s) -> s * s)
        .collect(Collectors.toList());

    List<Integer> numbers1 = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> squaredBiggerThanTwenty = numbers1.stream()
        .map((s) -> s * s)
        .filter((n) -> n > 20)
        .collect(Collectors.toList());

    double avg = numbers.stream()
        .collect(Collectors.averagingInt(p -> p));

    List<Integer> numbers2 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    int sumOfOdd = numbers.stream()
        .filter((n) -> n % 2 != 0)
        .mapToInt(Integer::intValue)
        .sum();

    List<String> strChars = new ArrayList<>(Arrays.asList("sGkdjFIKFslfdkI Kfd;F".split("(?!^)")));
    List<String> capitals = strChars.stream()
        .filter((s) -> !s.equals(s.toLowerCase()))
        .collect(Collectors.toList());

    List<String> startWith = getThoseThatStart("A");

    String str = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
    Map<Character, Long> m = getCharsFrequency(str);
  }

  public static List<String> getThoseThatStart(String prefix) {
    return Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS").stream()
        .filter((s -> s.startsWith(prefix)))
        .collect(Collectors.toList());
  }

  public static Map<Character, Long> getCharsFrequency(String str) {
    return str.chars()
        .mapToObj(c -> (char) c)
        .map(p -> p.toString().toLowerCase().charAt(0))
        .collect(groupingBy(Function.identity(), counting()));
  }
}
