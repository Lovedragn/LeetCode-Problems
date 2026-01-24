import java.util.Arrays;

public class Leet_1877 {
    public static int minPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int cal = nums[l] + nums[r];
            res = Math.max(cal, res);
            l++;
            r--;
        }
        return res;
    }

    public static void main(String args[]) {
        int nums[] = { 3, 5, 4, 2, 4, 6 };
        System.out.println(minPairSum(nums));
    }
}
