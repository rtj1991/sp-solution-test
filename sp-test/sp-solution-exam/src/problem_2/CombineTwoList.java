package problem_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineTwoList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> letters = Arrays.asList("a", "b", "c");

        List<Object> merged = mergeList(letters, numbers);
        System.out.println(merged);
    }

    public static <T> List<T> mergeList(List<? extends T> list1, List<? extends T> list2) {
        List<T> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() || j < list2.size()) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
                i++;
            }
            if (j < list2.size()) {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        return mergedList;
    }
}

