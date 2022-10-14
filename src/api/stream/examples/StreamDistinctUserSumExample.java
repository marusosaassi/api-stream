package api.stream.examples;

import api.stream.examples.models.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDistinctUserSumExample {
    public static void main(String[] args) {

        IntStream namesLength = Stream
                .of("Rafael Flores", "Maru Sosa", "Damian Ayim", "Victor Lavalle", "Vianey Aburto",
                        "Damian Sanchez", "Maru Sosa", "Maru Sosa")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length()) //converts to IntStream
                .peek(System.out::println);

        //we use toString to include both name and lastname, but we can use .getName or .getLastName to include only one

        //namesLength.forEach(System.out::println);
        //System.out.println("total: " + namesLength.sum());
        //System.out.println(namesLength.average());
        //there are conflicts if we try to execute both forEach and sum lines, or sum and average lines because
        //both are final operators. With IntSummaryStatistics we solve one of these problems

        IntSummaryStatistics stats = namesLength.summaryStatistics();
        //this is a final operator that includes everything

        System.out.println("total: " + stats.getSum());
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("count: " + stats.getCount());
        System.out.println("average: " + stats.getAverage());

    }
}
