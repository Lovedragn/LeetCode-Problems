
import java.util.*;

public class Leet_169 {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int s = nums[i];
            map.put(s, map.getOrDefault(s, 0) + 1);
            if (map.get(s) > max) {
                res = s;
                max = map.get(res);

            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {6, 5, 5};
        System.out.println(majorityElement(nums));

    }
}
