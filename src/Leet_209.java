
public class Leet_209 {

        public static int minSubArrayLen(int target, int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int result = nums.length + 1;
            int l = 0;
            int r = 0;
            int calc = 0;

            while (r < nums.length) {
                calc += nums[r];

                while (calc >= target) {
                    result = Math.min(result, r - l + 1);
                    calc -= nums[l];
                    l++;
                }
                r++;
            }

            return result == nums.length + 1 ? 0 : result;
        }

    public static void main(String[] args) {
        int[] nums = {5, 1, 3, 5, 10, 7, 4, 9, 2, 8};
        int target = 15;
        System.out.println(minSubArrayLen(target, nums));
    }
}
