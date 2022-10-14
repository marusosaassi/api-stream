package api.stream.examples;

import api.stream.examples.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilterEmptyExample {
    public static void main(String[] args) {

        /*Stream<String> names = Stream
                .of("Rafael Flores", "Maru Sosa", "", "Victor Lavalle", "Vianey Aburto",
                        "")
                .filter(n -> n.isEmpty())
                .peek(System.out::println);*/

        long count = Stream
                .of("Rafael Flores", "Maru Sosa", "", "Victor Lavalle", "Vianey Aburto",
                        "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = " + count);




    }
}
