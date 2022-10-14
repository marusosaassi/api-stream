package api.stream.examples;

import java.util.stream.Stream;

public class StreamReduceExample {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle",
                        "Vianey Aburto", "Damian Sanchez", "Rafael Flores", "Rafael Flores", "Rafael Flores")
                .distinct();


        String result = names.reduce("result = ", (a,b) -> a + ", " + b);
        // reduce() is a final operator, so it must return something (the result)
        // two arguments: initial value, in this case it is 'result = ', but could be an empty string or anything else
        // and then emits the "a" and "b"; a->previous, b->actual
        // and then a lambda expression to do something with these elements, in this case we concatenate the names

        System.out.println(result);
    }
}
