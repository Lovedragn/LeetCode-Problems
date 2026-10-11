import java.util.Collections;
import java.util.PriorityQueue;

public class Leet_2333 {

    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];

        long operations = (long) k1 + k2;
        long total = 0;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            total += diff[i];
            maxDiff = Math.max(maxDiff, diff[i]);
        }

        // All differences can become zero.
        if (total <= operations) {
            return 0;
        }

        // Find the smallest possible maximum difference.
        int left = 0;
        int right = maxDiff;

        while (left < right) {
            int mid = left + (right - left) / 2;
            long required = 0;

            for (int d : diff) {
                if (d > mid) {
                    required += d - mid;
                }
            }

            if (required <= operations) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }

        int limit = left;

        // Reduce every difference to at most limit.
        for (int i = 0; i < n; i++) {
            if (diff[i] > limit) {
                operations -= diff[i] - limit;
                diff[i] = limit;
            }
        }

        // Use leftover operations to reduce limit by one.
        for (int i = 0; i < n && operations > 0; i++) {
            if (diff[i] == limit) {
                diff[i]--;
                operations--;
            }
        }

        long result = 0;

        for (int d : diff) {
            result += (long) d * d;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 10, 12 };
        int[] arr2 = { 5, 8, 6, 9 };
        int k1 = 1, k2 = 1;

        System.out.println(minSumSquareDiff(arr1, arr2, k1, k2));
    }
}
