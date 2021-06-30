package LearningStream;

import java.util.Arrays;
import java.util.stream.*;

public class Stream {
    public static void main(String[] args) {

        // 1. Integer Stream prints in range
        System.out.println("Integer Stream prints a range");
        IntStream
                .range(1,10)
                .forEach(System.out::print);
        System.out.println();

        // 2.
        System.out.println("Integer Steam from a number a number in a range");
        IntStream
                .range(1,10)
                .skip(5)
                //.forEach(System.out::print);
                //Using lambda expression
                .forEach(x -> System.out.print(x));
        System.out.println();

        // 3. Integer steam with sum
        System.out.println("Prints the sum");
        System.out.println(
                IntStream
                .range(1,5)
                .sum()
        );
        System.out.println();

        // 4. Steam.of sorted and findFirst
        System.out.println("Steam.of sorted and findFirst");
        java.util.stream.Stream.of("Ava", "Mahadi", "Kamal")
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);

        System.out.println();

        // 5. Stream from Array , sort , filter and print
        System.out.println("Stream from Array , sort , filter and print");
        String[] names = {"Mahadi", "Kamal", "Rashir"};

        Arrays.stream(names)
                .filter(x -> x.startsWith("K"))
                .sorted()
                .forEach(System.out::print);
        System.out.println();

        // 6. average of square of an int array
        System.out.println("average of square of an int array");

        Arrays.stream(new int[] {2, 3, 6, 2})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::print);


    }
}
