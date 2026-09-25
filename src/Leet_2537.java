
import java.util.*;

public class Leet_2537 {

    public static long countGood(int[] nums, int k) {
        long res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            k -= map.getOrDefault(nums[i], 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while (k <= 0) {
                map.put(nums[left], map.get(nums[left]) - 1);
                k += map.get(nums[left++]);
            }
            res += left; 
        }
        return res;
    }

    public static void main(String args[]) {
        int nums[] = {3, 1, 4, 3, 2, 2, 4};
        int k = 2;
        System.out.println(countGood(nums, k));
    }
}
