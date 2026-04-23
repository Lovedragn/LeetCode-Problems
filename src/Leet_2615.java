import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leet_2615 {
    public static long[] distance(int[] nums) {
        long[] res = new long[nums.length];
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < res.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.put(nums[i], map.get(nums[i])).add(i);
        }

        for (int i = 0; i < res.length; i++) {
            if (res[i] != 0) {
                continue;
            }            
            List<Integer> temp = new ArrayList<>(map.get(nums[i]));
             temp.remove(Integer.valueOf(i));
            int count = 0;
            for (int j = 0; j < temp.size(); j++) {
                count += Math.abs(i -   temp.get(j));
            }
            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 1, 1, 2 };
        long[] res = distance(nums);

        for (long l : res) {
            System.out.println(l);
        }
    }
}
