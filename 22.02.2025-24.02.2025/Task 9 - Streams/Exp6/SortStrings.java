import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("nivi","pavi","sanjana","krish","dharun");


        List<String> ascendingOrder = words.stream()
                .sorted()
                .collect(Collectors.toList());


        List<String> descendingOrder = words.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());

        System.out.println("Sorted in Ascending Order: " + ascendingOrder);
        System.out.println("Sorted in Descending Order: " + descendingOrder);
    }
}
