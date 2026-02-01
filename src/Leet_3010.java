public class Leet_3010 {
    public class Leet_3010 {
        public static int minimumCost(int[] nums) {

            int M1 = nums[0];
            int M2 = Integer.MAX_VALUE;
            int M3 = Integer.MAX_VALUE;

            for (int i = 1; i < nums.length; i++) {
                int value = nums[i];
                if (value < M2) {
                    M3 = M2; // shift old M2 down
                    M2 = value; // update M2 with new smallest
                } else if (value < M3) {
                    M3 = value; // update second smallest
                }
            }
            return M1 + M2 + M3;
        }

        public static void main(String args[]) {
            int arr[] = { 1, 6, 49, 35, 41, 4, 31, 39, 36, 39 };
            System.out.println(minimumCost(arr));
        }
    }

}