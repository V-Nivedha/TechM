import java.util.ArrayList;
import java.util.List;

public class CoppyArrayList {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Blue");
        originalList.add("Green");
        originalList.add("Yellow");
        originalList.add("Purple");

        System.out.println("Original List: " + originalList);
        List<String> copiedList = new ArrayList<>(originalList);

        System.out.println("Copied List: " + copiedList);
    }
}