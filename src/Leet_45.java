
public class Leet_45 {

    public static int Jump(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                
                if (currentEnd >= nums.length - 1) break;
            }
        }
        
        return jumps;
    }

    public static void main(String args[]) {
        int nums[] = {2, 3, 5, 1, 1, 1};
        System.err.println(Jump(nums));
    }
}
