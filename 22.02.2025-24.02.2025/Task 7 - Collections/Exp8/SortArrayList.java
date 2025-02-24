import java.util.List;
import java.util.Collections;


public class SortArrayList {
    public static void main(String[] args) {
        List<String> colors = new java.util.ArrayList<>();
        colors.add("Red");
        colors.add("pink");
        colors.add("maroon");
        colors.add("grey");
        colors.add("black");

        System.out.println("Before Sorting: " + colors);
        Collections.sort(colors);
        System.out.println("After Sorting: " + colors);

    }
}