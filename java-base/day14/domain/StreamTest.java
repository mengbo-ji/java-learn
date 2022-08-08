package domain;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author jimengbo
 */
public class StreamTest {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl", "abc");
    List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).distinct().collect(Collectors.toList());
    System.out.println(filtered);
    String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
    System.out.println(mergedString);

    // List使用mapToInt
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    long count = list.stream().count();
    System.out.println(count);
    list.stream().mapToInt(t -> t * 2).limit(10).forEach(System.out::println);
  }
}
