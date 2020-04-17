package livro.cap8;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapTest {

  public static void main(String[] args) {
    String[][] test = new String[][]{{"1","2"}, {"3","4"}, {"1","6"}};

//    Stream<String[]> stream = Arrays.stream(test);
    Arrays.stream(test).flatMap(t -> Arrays.stream(t)).filter(t -> "1".equals(t.toString())).forEach(System.out::println);

//    stream.flatMap(s -> Arrays.stream(s)).forEach(System.out::println);
  }
}
