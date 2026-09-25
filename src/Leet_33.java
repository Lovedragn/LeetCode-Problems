
public class Leet_33 {

        public static int search(int[] nums, int target) {
            int result = -1;
            int len = nums.length-1;
            int l = 0, r = len;

            while (l <= r) {
                int mid = l+(r - l) / 2;
                if (nums[mid] == target) {
                    return mid;
                }

                if (nums[mid] >= nums[l]) {// lower higher
                    if (nums[l] <= target && target < nums[mid]) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                } else {
                    if (nums[mid] < target && target <= nums[r]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
            }
            return result;
        }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 0, 1, 2, 3};
        System.out.println(search(nums, 5));
    }
}
