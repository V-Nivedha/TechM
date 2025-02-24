import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ListAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100,50,5,78,651);

        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();

        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("List is empty.");
        }
    }
}
