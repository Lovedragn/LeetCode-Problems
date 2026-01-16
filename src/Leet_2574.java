public class Leet_2574 {
    public static int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int total = 0;
        int total2 = 0;

        // total
        for (int i = 0; i < rightsum.length; i++) {
            total2 += nums[i];
        }

        // left
        for (int i = nums.length - 1; i >= 0; i--) {
            leftsum[i] = total;
            total += nums[i];

            total2 -= nums[i];
            rightsum[i] = total2;

            nums[i] = Math.abs(leftsum[i] - rightsum[i]);
        }

        return nums;
    }

    public static void main(String args[]) {
        int[] nums = { 10, 4, 8, 3 };
        int[] result = leftRightDifference(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: 15 1 11 24
    }
}
