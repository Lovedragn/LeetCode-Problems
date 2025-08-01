import java.util.*;

public class Leet_46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, 0);
        return res;
    }

    public static void helper(int[] nums, List<List<Integer>> res, int index) {
        if (index == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums)
                permutation.add(num);
            res.add(permutation);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            helper(nums, res, index + 1);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3 };
        System.out.println(permute(nums));
    }
}
