package api.stream.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Stream<String> names = Stream.of("Rafael", "Maru", "Damian", "Victor", "Vianey");
        //names.forEach(System.out::println);

        //String[] arr = {"Rafael", "Maru", "Damian", "Victor", "Vianey"};
        //Stream<String> names2 = Arrays.stream(arr);
        //names = Arrays.stream(arr);
        //names.forEach(System.out::println);

        /*Stream<String> names = Stream.<String>builder()
                .add("Rafael")
                .add("Maru")
                .add("Damian")
                .add("Victor")
                .add("Vianey")
                .build();
        names.forEach(System.out::println);*/

        List<String> list = new ArrayList<>();
                list.add("Rafael");
                list.add("Maru");
                list.add("Damian");
                list.add("Victor");
                list.add("Vianey");
        //Stream<String> names = list.stream();
        //names.forEach(System.out::println);
        list.stream().forEach(System.out::println);
    }
}
