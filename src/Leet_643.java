
public class Leet_643 {

    public static double findMaxAverage(int[] nums, int k) {
        
        int max = 0;
        int result = 0;
        for (int i = 0; i < k; i++) {
            result+=nums[i];
           
        }
        max = result;

        int start = 0;
        int end = k;
        while (end < nums.length) { 
            
            result  = result - nums[start] + nums[end];
            max = Math.max(result, max);
            start ++;
            end++;
        }
        
        return (double) max/k; 
    }

    public static void main(String[] args) {
        int nums[] = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

}
