import java.util.Arrays;
import java.util.List;

public class EvenOddSumUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,52,53,78,77,63,101);

        int evenSum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

        int oddSum = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
