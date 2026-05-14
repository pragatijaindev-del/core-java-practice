package Java8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MultipleObjSorting {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("Pragati", 25),
                new Student("Aman", 22),
                new Student("Aman", 20)
        );
      list.sort (
    Comparator.comparing((Student e) -> e.name)
                .thenComparing(e -> e.age)
      );
      System.out.println(list);

    }
}

