import java.util.Arrays;
import java.util.List;

public class Leet_3364 {
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;

        for (int i = l ; i <= r; i++) {

            int temp = 0;
            int prev_idx = 0;
            // initial window
            for (int j = 0; j < i; j++) {
                temp += nums.get(j);
            }

            res = temp > 0 ? Math.min(res, temp) : res;

            for (int j = l; j < nums.size(); j++) {
                temp += nums.get(j);
                temp -= nums.get(prev_idx++);
                res = temp > 0 ? Math.min(res, temp) : res;
            }

        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
        System.out.println(minimumSumSubarray(Arrays.asList(3, -2, 1, 4), 2, 3));
    }
}
