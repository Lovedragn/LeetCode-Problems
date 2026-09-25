
import java.util.*;

public class Leet_1995 {

    public static int countQuadruplets(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();//-12
        int count = 0;
        int lens = nums.length;
        map.put(nums[lens - 1] - nums[lens - 2], 1);

        for (int i = 0; i < lens - 2; i++) {
            for (int j = i + 1; j < lens - 1; j++) {
                int calc = nums[i] + nums[j];
                if (map.containsKey(calc)) {
                    count++;
                } else {
                    map.put(calc, 1);//36 77 113 65 118 48   57 93 45 98 28   134 86 139 69     122 175 105    127 57    110  
                        
                }
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,5}; // 2,3,4,9  
        System.err.println(countQuadruplets(nums));
    }
}
