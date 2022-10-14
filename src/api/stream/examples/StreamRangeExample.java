package api.stream.examples;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamRangeExample {
    public static void main(String[] args) {

        IntStream numbers = IntStream.range(5, 20).peek(System.out::println);
        // we don't need a generic, because by default is Integer

        //Integer result = numbers.reduce(0, Integer::sum);
        //int result = numbers.sum(); //sum is an IntStream operator only
        //System.out.println(result);

        IntSummaryStatistics stats = numbers.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("sum: " + stats.getSum());
        System.out.println("mean: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());


    }
}
