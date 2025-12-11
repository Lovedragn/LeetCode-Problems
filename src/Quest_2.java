import java.util.HashSet;

public class Quest_2 {
    public static int[] findErrorNums(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int duplicate = -1;
        int n = nums.length;

        // Find duplicate
        for (int num : nums) {
            if (!seen.add(num)) {
                duplicate = num;
            }
        }

        // Find missing
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[] { duplicate, missing };
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 4, 6, 5 };// 2 3 3 4 5 6
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}
