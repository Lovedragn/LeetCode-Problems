public class Leet_Q6 {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1, 0, 1 };
        Leet_Q6 obj = new Leet_Q6();
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }

  public int findMaxConsecutiveOnes(int[] nums) {
    int res = 0;
    int l = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
            continue;
        }
        res = Math.max(res, i - l);
        l = i + 1;
    }
    // Final check for trailing ones
    res = Math.max(res, nums.length - l);
    return res;
}
}
