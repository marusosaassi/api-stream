package api.stream.examples;

import api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamSingleFilterExample2 {
    public static void main(String[] args) {

        User user = Stream
                .of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle", "Vianey Aburto",
                        "Damian Sanchez")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getId().equals(4))
                .findFirst().get();


        System.out.println(user);

    }
}
