public class Leet_75 {
    public static void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length - 1;

        while (m <= h) {
            int mid = nums[m];

            if (mid == 0) {
                nums = swap(nums, l, m);
                m++;
                l++;
            } else if (mid == 1) {
                m++;
            } else if (mid == 2) {
                nums = swap(nums, m, h);
                h--;
            } else {
                m++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = { 2, 0, 1 };

        sortColors(nums);
    }
}
