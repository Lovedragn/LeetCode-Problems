public class Leet_3379 {
    public static int[] constructTransformedArray(int[] nums) {
        int res[] = new int[nums.length];

        for (int i = 0; i < res.length; i++) {
            int val = nums[i];
            int newIndex = (i + val) % nums.length;
            // Handle negative modulo results
            if (newIndex < 0) {
                newIndex += nums.length;
            }
            res[i] = nums[newIndex];
        }

        for (int i : res) {
            System.out.println(i);
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = { -1,4,-1 };
        constructTransformedArray(arr);
    }
}
