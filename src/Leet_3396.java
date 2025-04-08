
import java.util.*;

public class Leet_3396 {

    public static int minimumOperations(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        for (int i = 0; i < nums.length; i += 3) {
            if (map.containsValue(nums[i])) {
                for (int j = start; j < (start + 3); j++) {
                    map.remove(j);
                }
                start += 3;
                res++;
            }
            int ender;
            if (nums.length - i >= 3) {
                ender = i + 3;
            } else {
                ender = nums.length; 
            }

           
            for (int j = i; j < ender; j++) {
                map.put(j, nums[j]);
            }


        }
        return res;
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 2};
        System.out.println(minimumOperations(arr));

    }
}
