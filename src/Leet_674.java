public class Leet_674 {
    public static int findLengthOfLCIS(int[] nums) {
         if (nums == null || nums.length == 0) return 0;
   
        int res =1;
        int idx =0;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] <= nums[i-1]){
                idx = i;
            }
            res = Math.max(res, Math.abs(idx - i)+1);
        }
        
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,2,3,4,1,2,3,4,5,54,4};
        System.out.println(findLengthOfLCIS(arr));
    }
}
