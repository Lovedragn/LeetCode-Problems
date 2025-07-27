import java.util.*;

public class Leet_Q4 {

    public static int countDistinct(int[] nums, int k, int p) {
        Set<String> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < n; j++) {
                if (nums[j] % p == 0) count++;
                if (count > k) break;

                sb.append(nums[j]).append(",");
                set.add(sb.toString());
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 2};
        int k = 2, p = 2;
        System.out.println(countDistinct(nums, k, p)); // Output: 11
    }


}
