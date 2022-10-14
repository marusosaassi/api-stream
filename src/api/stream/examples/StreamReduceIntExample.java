package api.stream.examples;

import java.util.stream.Stream;

public class StreamReduceIntExample {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(5, 10, 15, 20);

        //Integer result = numbers.reduce(0, (a,b) -> a+b);
        Integer result = numbers.reduce(0, Integer::sum);
        // reduce() is a final operator, so it must return something (the result)
        // two arguments: initial value, in this case it is 0
        // and then emits the "a" and "b"; a->previous, b->actual
        // and then a lambda expression to do something with these elements, in this case, an addition of numbers

        System.out.println(result);
    }
}
