public class Leet_3701 {
    public static int alternatingSum(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (0 == i % 2) {
                res += nums[i];
            } else {
                res -= nums[i];
            }
        }
        return res;
    }
}
