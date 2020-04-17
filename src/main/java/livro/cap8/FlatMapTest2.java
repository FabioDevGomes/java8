package livro.cap8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.print.attribute.standard.JobStateReason;

public class FlatMapTest2 {

  public static void main(String[] args) {

    StudentPOJO pojo = new StudentPOJO();
    pojo.setName("Fábio");
    pojo.addBook("A menina que tinha dons");
    pojo.addBook("Uma breve história do tempo");
    pojo.addBook("A sutiu arte de ligar o foda-se");

    StudentPOJO pojo2 = new StudentPOJO();
    pojo2.setName("Any");
    pojo2.addBook("Java 8 in Action");
    pojo2.addBook("Spring Boot in Action");
    pojo2.addBook("Effective Java (2nd Edition)");

    List<StudentPOJO> students = Arrays.asList(pojo, pojo2);

    Stream<Set<String>> collect = students.stream().map(s -> s.getBooks());
    Stream<String> collect2 = students.stream().map(s -> s.getBooks()).flatMap(s -> s.stream());
//    Stream<String> collect3 = students.stream().flatMap(s -> s.stream(s));

  }
}
