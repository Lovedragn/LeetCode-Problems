public class Leet_2778 {
    public static int sumOfSquares(int[] nums) {
        int res =0;

        for (int i = 1; i <= nums.length; i++) {
            
            int idx = nums.length % i;
            
            if(idx  == 0){
                res += (nums[i-1] * nums[i-1]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sumOfSquares(new int[]{1,2,3,4}));
    }
}
