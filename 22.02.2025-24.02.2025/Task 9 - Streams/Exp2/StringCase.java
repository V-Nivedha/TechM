import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Nivedha","Kishore","Pooja","Saran");

        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());

        List<String> lowerCaseWords = words.stream().map(String::toLowerCase).collect(Collectors.toList());

        System.out.println("Uppercase: " + upperCaseWords);
        System.out.println("Lowercase: " + lowerCaseWords);
    }
}
