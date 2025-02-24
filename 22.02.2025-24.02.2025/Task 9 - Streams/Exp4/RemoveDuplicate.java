import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,5,8,77,77,9,9,58,2,58);

        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("List without Duplicates: " + uniqueNumbers);
    }
}
