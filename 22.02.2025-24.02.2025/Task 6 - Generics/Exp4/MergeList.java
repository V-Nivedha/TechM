import java.util.List;
import java.util.ArrayList;

class MergeList {
    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() || j < list2.size()) {
            if (i < list1.size()) mergedList.add(list1.get(i++));
            if (j < list2.size()) mergedList.add(list2.get(j++));
        }

        return mergedList;
    }

    public static void main(String[] args) {


        List<String> words1 = List.of("we","in","Fullstack");
        List<String> words2 = List.of("are","java","Training");

        System.out.println(mergeAlternating(words1, words2));
    }
}
