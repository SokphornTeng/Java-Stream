package org.example.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_1 {
    static List<stream_01> object_1 = new ArrayList<>();
    static {
        object_1.add(new stream_01("AA", "aa", 2.2, List.of("tt", "kk")));
        object_1.add(new stream_01("BB","bb", 3.3, List.of("yy", "uu")));
        object_1.add( new stream_01("CC", "cc", 1.1, List.of("hh", "bb")));
        object_1.add(new stream_01("NN", "nn", 4.4, List.of("RR", "ii")));
    }

    public static void main(String[] args) {

        // foreach
//        object_1.stream().forEach(data -> System.out.println(data));

        //map
//        Set<stream_01> object_2 = object_1.stream().map(data -> new stream_01(
//                data.getFirstName(),
//                data.getLastName(),
//                data.getSalary(),
//                data.getInfor()
//        )).collect(Collectors.toSet());
//       System.out.println(object_2);

        //filter
//        List<stream_01> object_3 = object_1.stream().filter(data -> data.getSalary() < 4.4)
//                .map(data -> new stream_01(
//                        data.getFirstName(),
//                        data.getLastName(),
//                        data.getSalary(),
//                        data.getInfor()
//                )).collect(Collectors.toList());
//        System.out.println(object_3);

        //findFirst -> take only one
//        stream_01 object_4 = object_1.stream().filter(data -> data.getSalary() < 4.4)
//                .map(data -> new stream_01(
//                        data.getFirstName(),
//                        data.getLastName(),
//                        data.getSalary(),
//                        data.getInfor()
//                )).findFirst().orElse(null);
//        System.out.println(object_4);

        //take List of info and use flatMap
//        String object_5 = object_1.stream().map(data -> data.getInfor())
//                .flatMap(x -> x.stream()).collect(Collectors.joining());
//        System.out.println(object_5);

        //skip with limit
//        List<stream_01> object_6 = object_1.stream().skip(3).limit(2).collect(Collectors.toList());
//        System.out.println(object_6);

        // ramdon number
//        Stream.generate(Math::random).limit(3).forEach(x -> System.out.println(x));


        //Sorted
//        List<stream_01> object_7 = object_1.stream().sorted((a, b) -> a.getFirstName()
//                .compareToIgnoreCase(b.getFirstName())).collect(Collectors.toList());
//        System.out.println(object_7);

        //min and max
//        System.out.println(
//                object_1.stream().max(Comparator.comparing(stream_01::getSalary)).orElseThrow(NoSuchElementException::new)
//        );


        //reduct not clear yet
//        Double object_8 = object_1.stream().map(data -> data.getSalary()).reduce(0.0, double::sum);
//        System.out.println(object_8);




    }

}
