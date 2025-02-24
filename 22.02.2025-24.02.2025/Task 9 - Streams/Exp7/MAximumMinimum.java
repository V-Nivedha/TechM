import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MAximumMinimum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,58,87,5,89,25,74,3,2);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        if (max.isPresent() && min.isPresent()) {
            System.out.println("Maximum Value: " + max.get());
            System.out.println("Minimum Value: " + min.get());
        } else {
            System.out.println("List is empty.");
        }
    }
}
