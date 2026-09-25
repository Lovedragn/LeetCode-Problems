
import java.util.HashMap;

public class Leet_2006 {

    public static int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] + k)) {
                result += map.get(nums[i] + k);
            }
            else if (map.containsKey(nums[i] - k)) {
                result += map.get(nums[i] - k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int k = 1;
        System.out.println(countKDifference(nums, k));
    }
}
