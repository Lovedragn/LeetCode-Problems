
import java.util.*;

public class Leet_2563 {

    public static long least(int[] nums, long comp) {
        long res = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] >= comp) {
                res += j - i;
                j--;
            } else {
                i++;
            }
        }
        return res;
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return least(nums, lower) - least(nums, upper + 1);
    }

    public static void main(String args[]) {
        int nums[] = {0, 1, 7, 4, 4, 5};//0 1 4 4 5 7
        System.out.println(countFairPairs(nums, 3, 6));
    }
}
