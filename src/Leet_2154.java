import java.util.Arrays;

public class Leet_2154 {
    public static int findFinalValue(int[] nums, int original) {

        Arrays.sort(nums);
        int left_fix = 0;
        while (true) {
            int founded = -1;
            // ~binary search

            int l = left_fix;
            int r = nums.length;
            while (l < r) {

                int mid = l + (r - l) / 2;
                if (nums[mid] == original) {
                    founded = mid;
                    original *= 2;
                    left_fix = mid + 1;
                    break;
                } else if (nums[mid] > original) {
                    r = mid;
                } else if (nums[mid] < original) {
                    l = mid +1;
                }

            }
            if (founded == -1) {

                break;
            }
        }
        return original;
    }

    public static void main(String args[]) {
        int nums[] = { 5, 3, 6, 1, 12 };// 1 3 5 6 12
        int original = 3;

        int res = findFinalValue(nums, original);
        System.out.println(res);
    }
}
