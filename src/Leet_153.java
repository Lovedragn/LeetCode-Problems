
public class Leet_153 {

    public static int findMin(int[] nums) {

        int l = 0, r = nums.length - 1;

        if (nums[l] < nums[r] || nums.length < 2)
            return nums[l];

        while (l <= r) {

            int mid = l + (r - l) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[mid] > nums[r]) {
                l = mid + 1;

            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findMin(nums));
    }
}
