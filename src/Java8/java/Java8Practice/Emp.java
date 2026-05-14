package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java","springboot","javascript");

        Map<String,Integer> map =names.stream()
                .collect(Collectors.toMap(name->name, name -> name.length()));
        System.out.println(map);
    }
}
