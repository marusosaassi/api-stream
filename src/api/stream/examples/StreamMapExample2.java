package api.stream.examples;

import api.stream.examples.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExample2 {
    public static void main(String[] args) {

        /*Stream<User> names = Stream
                .of("Rafael", "Maru", "Damian", "Victor", "Vianey")
                .map(name -> new User(name, null))
                .peek(u -> System.out.println(u.getName()))
                .map(user -> {
                    String name = user.getName().toUpperCase();
                    user.setName(name);
                    return user;
                });*/

        Stream<User> names = Stream
                .of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle", "Vianey Aburto")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(System.out::println)
                .map(user -> {
                    String name = user.getName().toUpperCase();
                    user.setName(name);
                    return user;
                });


        List<User> list = names.collect(Collectors.toList());
        // accumulates the input elements into a new List
        // when we call this, we are calling the peek, because it is terminal and will execute the stream
        list.forEach(u -> System.out.println(u.toString()));

    }
}
