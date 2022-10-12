package api.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExample {
    public static void main(String[] args) {
        /*Stream<String> names = Stream
                .of("Rafael", "Maru", "Damian", "Victor", "Vianey")
                .map(name -> {
                    return name.toUpperCase();
                });
        names.forEach(System.out::println);*/

        /*Stream<String> names = Stream
                .of("Rafael", "Maru", "Damian", "Victor", "Vianey")
                .map(name -> name.toUpperCase())
                .peek(e -> System.out.println(e))
                .map(e -> e.toLowerCase());
        names.forEach(System.out::println);*/

        Stream<String> names = Stream
                .of("Rafael", "Maru", "Damian", "Victor", "Vianey")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        //names.forEach(System.out::println);

        List<String> list = names.collect(Collectors.toList());
        // accumulates the input elements into a new List
        // when we call this, we are calling the peek, because it is terminal and will execute the stream
        list.forEach(System.out::println);

    }
}
