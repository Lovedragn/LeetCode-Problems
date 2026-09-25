
import java.util.*;

public class Leet_162 {

        public static int findPeakElement(int[] nums) {
            int result = 0;
            int l = 0;
            int r = nums.length - 1;
            boolean rightcheck = false;
            boolean leftcheck = false;

            while (l < r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] > nums[mid - 1] || mid ==0) {
                    leftcheck = true;
                }
                if (nums[mid] > nums[mid + 1] || mid ==nums.length-1) {
                    rightcheck = true;
                }
                if (leftcheck && rightcheck) {
                    return mid;
                }
                if (nums[mid - 1] > nums[mid] && mid > 0) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return result;
        }
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 1};
        System.out.println(findPeakElement(nums));
    }
}
