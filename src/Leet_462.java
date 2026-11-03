import java.util.Arrays;

public class Leet_462 {
    public static int minMoves2(int[] nums) {
        int medium = 0;
        Arrays.sort(nums);
        int n = nums.length;

        medium = nums[(n / 2)];

        int count = 0;
        for (int i : nums) {
            count += Math.abs(medium - i);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(minMoves2(arr));
    }
}
