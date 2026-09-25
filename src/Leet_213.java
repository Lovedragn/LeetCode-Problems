import java.util.*;

public class Leet_213 {
    public static int rob(int[] nums) {
        int res = Math.max(nums[0], Math.max(helper(Arrays.copyOfRange(nums, 1, nums.length)),
                helper(Arrays.copyOfRange(nums, 0, nums.length - 1))));

        return res;
    }

    public static int helper(int[] nums) {
        int rob1 =0 , rob2=0;

        for (int i : nums) {
            int temp = Math.max(rob1 + i , rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        
        return rob2;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(rob(arr));
    }
}
