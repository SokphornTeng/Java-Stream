package org.example.Stream_11;

import java.util.*;
import java.util.stream.Collectors;

public class Excute {

   public static List<Person> getPerson(){
     return List.of(
               new Person("Sokphorn", 24, Gender.FEMALE),
             new Person("Vuthe", 20, Gender.MALE),
             new Person("Soklin", 30, Gender.MALE),
             new Person("Tola", 27, Gender.FEMALE)
       );
   }

    public static void main(String[] args) {
       List<Person> objPerson = getPerson();

        /*
        // loop data
        List<Person> females = new ArrayList<>();
        for(Person obj : objPerson){
            if(obj.getGender().equals(Gender.FEMALE)){
                females.add(obj);
            }
        }
        System.out.println(females);
        females.forEach(System.out::print);
        */

        /*
        // filter data as loop above
        List<Person> females = objPerson.stream().filter(x -> x.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        System.out.println(females);
         */

        /*
        //Sort for age and gender
        List<Person> sorted = objPerson.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed()).collect(Collectors.toList());
        System.out.println(sorted);
         */

        /*
        // take data that not match, allMatch, anyMatch in array
        boolean obj = objPerson.stream().noneMatch(x ->x.getName().equals("sokphorn"));
        System.out.println(obj);

        boolean obj = objPerson.stream().anyMatch(x ->x.getAge() < 10);
        System.out.println(obj);

        boolean obj = objPerson.stream().allMatch(x ->x.getAge() < 18);
        System.out.println(obj);
         */

        /*
        // take about age of max and min
        objPerson.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::print);
        objPerson.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::print);
         */

        /*
        //put gender in a group as group female and male
        Map<Gender, List<Person>> group = objPerson.stream().collect(Collectors.groupingBy(Person::getGender));
        System.out.println(group);
         */


        /*
        //it take Tola
        Optional<String> test = String.valueOf(objPerson.stream().filter(a -> a.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
               .map(Person::getName)).describeConstable();
//        System.out.println(test);
        test.ifPresent(System.out::println);
         */

        /*
        Map<Gender, List<Person>> group = objPerson.stream().collect(Collectors.groupingBy(Person::getGender));
        group.forEach((a, b) -> {
            System.out.println(a);
            b.forEach(System.out::print);
        });
//        System.out.println(group);

         */

    }
}
