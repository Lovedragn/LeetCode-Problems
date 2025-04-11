
import java.util.*;

public class Leet_16 {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < nums.length - 2; i++) {
            int k = i + 1;
            int r = nums.length - 1;
            while (k < r) {
                int temp = nums[i] + nums[k] + nums[r];
                if (Math.abs(temp - target) < Math.abs(closest - target)) {
                    closest = temp;
                }
                if (temp < target) {
                    k++;
                } else {
                    r--;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
