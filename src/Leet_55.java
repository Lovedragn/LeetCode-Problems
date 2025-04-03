
public class Leet_55 {

        public static boolean canJump(int[] nums) {

            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (k < 0) {
                    return false;
                }
                if (k < nums[i]) {
                    k = nums[i];//2
                }
                k -=1;//1 
            }
            return true;
        }

        public static void main(String args[]) {
            int nums[] = {2, 5, 0, 0};
            System.err.println(canJump(nums));
        }
}
