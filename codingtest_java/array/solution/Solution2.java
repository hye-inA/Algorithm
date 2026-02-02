import java.util.Collections;
import java.util.TreeSet;

public class Solution2 {
    private static int[] solution(int[] arr) {

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            treeSet.add(num);
        }

        int[] result = new int[treeSet.size()];
        int index = 0;
        for (int num : treeSet) {
            result[index++] = num;
        }
        return result;
    }

}
