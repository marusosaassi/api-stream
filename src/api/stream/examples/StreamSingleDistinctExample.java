package api.stream.examples;

import api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamSingleDistinctExample {
    public static void main(String[] args) {

        /*Stream.of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle",
                        "Vianey Aburto", "Damian Sanchez", "Rafael Flores", "Rafael Flores", "Rafael Flores")
                .distinct()
                .forEach(System.out::println);*/

        Stream<String> names = Stream.of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle",
                        "Vianey Aburto", "Damian Sanchez", "Rafael Flores", "Rafael Flores", "Rafael Flores")
                .distinct();

        names.forEach(System.out::println); // groups the duplicates in only one



    }
}
