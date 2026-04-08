public class Leet_3653 {
    public static int xorAfterQueries(int[] nums, int[][] queries) {
        int res = 0;
        int MOD = 1_000_000_007;
        for (int i : nums) {
            res ^= i;
        }
        for (int[] q : queries) {

            int idx = q[0];
            int end = q[1];
            int step = q[2];
            int mul = q[3];

            while (idx <= end) {
                int oldVal = nums[idx];

                // Use long to avoid overflow, then reduce modulo MOD
                long product = (1L * oldVal * mul) % MOD;
                int newVal = (int) product;

                res ^= oldVal;
                res ^= newVal;
                nums[idx] = newVal;

                idx += step;
            }

        }

        return (int) res;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 5, 4 };
        int[][] queries = { { 1, 4, 2, 3 }, { 0, 2, 1, 2 } };
        System.out.println(xorAfterQueries(nums, queries));
    }
}
