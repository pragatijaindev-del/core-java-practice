package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(1, 200),
                new Order(2, 700),
                new Order(3, 900)
        );

        // filter orders where amount > 500
        List<Order> result = orders.stream()
                .filter(order -> order.amount > 500)
                .collect(Collectors.toList());


        System.out.println(result);
    }
}

