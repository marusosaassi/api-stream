package api.stream.examples;

import api.stream.examples.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSingleFilterExample {
    public static void main(String[] args) {

        Stream<User> names = Stream
                .of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle", "Vianey Aburto",
                        "Damian Sanchez")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getName().equals("Damian"))
                .peek(System.out::println);


        Optional<User> user = names.findFirst(); //only returns 1 Damian
        System.out.println(user.get());

    }
}
