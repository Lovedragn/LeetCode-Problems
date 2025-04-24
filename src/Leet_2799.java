
import java.util.*;

public class Leet_2799 {

    public static int countCompleteSubarrays(int[] nums) {
        int res = 0;

        Set<Integer> distinctSet = new HashSet<>();
        for (int elem : nums) {
            distinctSet.add(elem);
        }
        int totalDistinctCount = distinctSet.size();

        for (int l = 0; l < nums.length; l++) {
            HashSet<Integer> currentSet = new HashSet<>();
            for (int r = l; r < nums.length; r++) {
                currentSet.add(nums[r]);
                if (currentSet.size() == totalDistinctCount) {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 5};
        System.out.println(countCompleteSubarrays(arr));
    }
}
