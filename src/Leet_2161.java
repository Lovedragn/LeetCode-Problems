import java.util.*;

public class Leet_2161 {
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] newarr = new int[nums.length];
        int idx = 0;

        // Pass 1: elements less than pivot
        for (int num : nums) {
            if (num < pivot) {
                newarr[idx++] = num;
            }
        }

        // Pass 2: elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                newarr[idx++] = num;
            }
        }

        // Pass 3: elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                newarr[idx++] = num;
            }
        }

        return newarr;
    }

    public static void main(String args[]) {
        int[] nums = { 9, 12, 5, 10, 14, 3, 10 };
        int pivot = 10;
        int[] result = pivotArray(nums, pivot);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: 9 5 3 10 10 12 14
    }
}