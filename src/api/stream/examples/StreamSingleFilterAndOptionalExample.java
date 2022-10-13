package api.stream.examples;

import api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamSingleFilterAndOptionalExample {
    public static void main(String[] args) {

        Stream<User> names = Stream
                .of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle", "Vianey Aburto",
                        "Damian Sanchez")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getName().equals("Damianx"))
                .peek(System.out::println);


        Optional<User> user = names.findFirst(); //only returns 1 Damian
        //System.out.println(user.orElse(new User("John", "Doe")).getName());
        //System.out.println(user.orElseGet(() -> new User("John", "Doe")).getName());
        //orElseGet=> we pass a supplier, who doesn't receive arguments but returns some value
        //System.out.println(user.orElseThrow());
        //we throw an exception or customized exception
        if(user.isPresent()) { //or (!user.isEmpty) returns the same result
            System.out.println(user.get());
        }else {
            System.out.println("Object not found");
        }
        //isPresent and isEmpty are the negation of each other. isEmpty is available since Java11.

    }
}
