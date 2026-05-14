package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatenMap {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );
        //flatten nested list
        List<Integer> result = list.stream().flatMap(e -> e.stream())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
