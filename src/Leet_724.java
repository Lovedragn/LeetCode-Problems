public class Leet_724 {
     public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        
        int left_total = 0;
        for (int i = 0; i < nums.length; i++) {
            int right_total = total - left_total - nums[i];
            if (left_total == right_total) {
                return i;
            }
            left_total += nums[i];
        }
        
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,2,3}));
    } 
}
