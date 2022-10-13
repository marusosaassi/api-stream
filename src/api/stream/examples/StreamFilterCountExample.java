package api.stream.examples;

import api.stream.examples.models.User;

import java.util.stream.Stream;

public class StreamFilterCountExample {
    public static void main(String[] args) {

        long count = Stream
                .of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle", "Vianey Aburto",
                        "Damian Sanchez")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .count();
        // similar to findFirst, but fF returned an object and anyMatch returns a boolean

        System.out.println(count);

    }
}
