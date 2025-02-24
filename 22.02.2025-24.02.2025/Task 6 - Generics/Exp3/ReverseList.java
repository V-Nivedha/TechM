import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class ReverseList {
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static void main(String[] args) {

        List<String> words = List.of("nivi","kishore", "Nithish","Pooja");
        System.out.println(reverseList(words));
    }
}
