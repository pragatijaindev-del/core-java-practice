package Java8Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Salary {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(10000,30000,20000,70000);
       Integer secondHighest = salaries.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
       System.out.println(secondHighest);

    }

    }

