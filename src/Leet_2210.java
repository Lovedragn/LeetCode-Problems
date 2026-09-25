public class Leet_2210 {
    public static int countHillValley(int[] nums) {
        int n = nums.length;
        int res = 0;

        int l = 0;
        int mid = 1;
        int r = 2;

        // Skip duplicates at the beginning
        while (mid < n && nums[mid] == nums[l]) mid++;

        while (mid < n - 1) {
            r = mid + 1;
            // Skip duplicates on the right
            while (r < n && nums[r] == nums[mid]) r++;

            if (r == n) break;

            if ((nums[l] < nums[mid] && nums[mid] > nums[r]) ||  // Hill
                (nums[l] > nums[mid] && nums[mid] < nums[r])) {  // Valley
                res++;
            }

            l = mid;
            mid = r;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 1, 6, 5};
        System.out.println(countHillValley(arr));  // Output: 3
    }
}
