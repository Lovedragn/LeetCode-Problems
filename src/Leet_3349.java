import java.util.*;

public class Leet_3349 {
    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        for (int i = 0; i <= n - 2 * k; i++) {
            if (isIncreasing(nums, i, k) && isIncreasing(nums, i + k, k)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIncreasing(List<Integer> list, int start, int length) {
        for (int j = start; j < start + length - 1; j++) {
            if (list.get(j) >= list.get(j + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1);
        System.out.println(hasIncreasingSubarrays(list, 3)); // true
    }
}