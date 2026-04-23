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
            map.get(nums[i]).add(i);
        }

        for (List<Integer> temp : map.values()) {
            if (temp.size() <= 1)
                continue;

            long[] prefix = new long[temp.size() + 1];
            for (int k = 0; k < temp.size(); k++) {
                prefix[k + 1] = prefix[k] + temp.get(k);
            }

            for (int k = 0; k < temp.size(); k++) {
                int idx = temp.get(k);
                long left = (long) idx * k - prefix[k];
                long right = (prefix[temp.size()] - prefix[k + 1]) - (long) idx * (temp.size() - k - 1);
                res[idx] = left + right;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,1,1,2 };
        long[] res = distance(nums);

        for (long l : res) {
            System.out.println(l);
        }
    }
}
