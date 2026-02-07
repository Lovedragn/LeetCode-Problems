import java.util.Arrays;
import java.util.PriorityQueue;

public class Leet_3634 {
    public static int minRemoval(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int maxKeep = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && (long) nums[j] <= (long) k * nums[i]) {
                j++;
            }
            maxKeep = Math.max(maxKeep, j - i);
        }
        return n - maxKeep;
    }

    public static void main(String[] args) {
        int arr[] = { 1,6,2,9 };
        System.out.println(minRemoval(arr, 2));
    }
}
