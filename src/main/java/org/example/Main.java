package org.example;

import org.example.Stream.stream_1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // result [1, 4, 5, 3, 7]
//        List<Integer> list_1 = Arrays.asList(1, 4, 5, 3, 7);
//        List<Integer> list_2 = list_1.stream().toList();
//        System.out.println(list_2);

        // result [4]
//        List<Integer> list_1 = Arrays.asList(1, 4, 5, 3, 7);
//        List<Integer> list_2 = list_1.stream().filter(x->x % 2 == 0 ).collect(Collectors.toList());
//        System.out.println(list_2);

        // result [2, 8, 10, 6, 14]
//        List<Integer> list_1 = Arrays.asList(1, 4, 5, 3, 7);
//        List<Integer> list_2 = list_1.stream().map(x->x + x ).collect(Collectors.toList());
//        System.out.println(list_2);


        // result [1, 3, 4, 5, 7]
//        List<Integer> list_1 = Arrays.asList(1, 4, 5, 3, 7);
//        List<Integer> list_2 = list_1.stream().sorted().collect(Collectors.toList());
//        System.out.println(list_2);

        // result [D]
//        List<String> list_1 = Arrays.asList("A", "B", "C", "D", "E");
//        List<String> list_2 = list_1.stream().filter(x -> x.startsWith("D")).collect(Collectors.toList());
//        System.out.println(list_2);


        // result [2, 6, 8, 10, 14] -> set
//        List<Integer> list_1 = Arrays.asList(1, 4, 5, 3, 7);
//        Set<Integer> list_2 = list_1.stream().map(x->x + x ).collect(Collectors.toSet());
//        System.out.println(list_2);

        // result [4]
//        List<Integer> list_1 = Arrays.asList(1, 4, 5, 3, 7);
//        List<Integer> list_2 = Collections.singletonList(list_1.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i));
//        System.out.println(list_2);
    }
}