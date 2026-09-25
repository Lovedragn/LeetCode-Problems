
import java.util.*;

public class Leet_228 {

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res; 
        }

        int l = 0; // Start of the range

        while (l < nums.length) {
            int r = l;

            // Expand r to find the end of the range
            while (r + 1 < nums.length && nums[r + 1] == nums[r] + 1) {
                r++;
            }

            // Add range or single number
            if (l == r) {
                res.add(String.valueOf(nums[l])); // Single number
            } else {
                res.add(nums[l] + "->" + nums[r]); // Range
            }

            l = r + 1; // Move to the next potential range
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = {0, 2, 3, 4, 6, 8, 9}; // Input array
        System.out.println(summaryRanges(nums)); // Expected Output: ["0", "2->4", "6", "8->9"]
    }
}
