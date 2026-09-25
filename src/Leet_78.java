import java.util.*;

public class Leet_78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, 0, new ArrayList<>());
        return res;
    }

    public static void helper(int[] nums, List<List<Integer>> res, int index, List<Integer> temp) {
        if (index == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // skip
        temp.add(nums[index]);
        helper(nums, res, index + 1, temp);
        // dont skip
        temp.remove(temp.size()-1);
        helper(nums, res, index + 1, temp);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };
        System.out.println(subsets(arr));
    }
}
