package api.stream.examples;

import api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamDistinctUserExample {
    public static void main(String[] args) {

        Stream<User> names = Stream
                .of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle", "Vianey Aburto",
                        "Damian Sanchez", "Maru Sosa", "Maru Sosa")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .distinct();

        names.forEach(System.out::println);

    }
}
