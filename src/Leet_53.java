public class Leet_53 {
    public static int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int curr = 0;
        for (int i : nums) {
            curr += i;
            res = Math.max(res, curr);
            if (curr < 0) {
                curr = 0;
                continue;
            }
        }
        return nums.length == 1 ? nums[0] : res;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr)); // Expected: 6
    }
}
