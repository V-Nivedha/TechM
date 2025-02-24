import java.util.Arrays;
import java.util.List;

public class CountStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");

        char targetLetter = 'a';

        long count = words.stream().filter(word -> word.startsWith(String.valueOf(targetLetter))).count();

        System.out.println("Number of words starting with '" + targetLetter + "': " + count);
    }
}
