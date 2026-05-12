package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> duplicate = Arrays.stream(arr)
                .boxed()
                .filter(num -> !set.add(num))
                .collect(Collectors.toSet());
        System.out.println(duplicate);


    }
}
