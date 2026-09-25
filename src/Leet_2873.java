
public class Leet_2873 {

    public static long maximumTripletValue(int[] nums) {
        long res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int k = nums.length - 1; k > i; k--) {
                int j = i + 1;
                while (j < k) {
                    res = Math.max( (long)(nums[i] - nums[j]) * nums[k], res);
                    j++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1000000,1,1000000};
        System.out.println(maximumTripletValue(nums));
    }
}
