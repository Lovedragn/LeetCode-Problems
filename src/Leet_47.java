import java.util.*;

public class Leet_47 {
    public static List<List<Integer>> res;

    public static List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums); // sort to handle duplicates
        backtrack(nums, new boolean[nums.length], new ArrayList<>());
        return res;
    }

    private static void backtrack(int[] nums, boolean[] used, List<Integer> temp) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // skip duplicates
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            temp.add(nums[i]);

            backtrack(nums, used, temp);

            // backtrack
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        List<List<Integer>> list = permuteUnique(arr);
        System.out.println(list);
    }
} 