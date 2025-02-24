import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original List: " + colors);
        Collections.shuffle(colors);

        System.out.println("Shuffled List: " + colors);
    }
}