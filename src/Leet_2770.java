public class Leet_2770 {
    public static int maximumjumps(int[] nums, int target) {
        int res = checker(nums, 0, target);
        return res == 0 ? -1 : res;
    }

    public static int checker(int[] nums, int j, int target) {
        if (j == nums.length - 1) {
            return 0;
        }
        int max = -1;

        for (int J = j + 1; J < nums.length; J++) {
            if (Math.abs(nums[J] - nums[j]) <= target) {
                int next = checker(nums, J, target);
                if (next != -1)
                    max = Math.max(max, 1 + next);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 6, 4, 1, 2 };
        int target = 3;
        System.out.println(maximumjumps(nums, target));
    }
}