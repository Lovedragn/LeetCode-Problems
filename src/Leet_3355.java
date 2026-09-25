

public class Leet_3355 {

    public static boolean isZeroArray(int[] nums, int[][] queries) {
        for (int[] elem : queries) {
            int start = elem[0];//0
            int end = elem[1];//2
            
            for (int i = start; i <= end ; i++) {//2
                if (nums[i] > 0) {
                    nums[i]--;
                }
            }

        }
        for (int elem :nums) {
            if (elem != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int[] nums = {1,0,1};
        int[][] queries = {{0, 2}};
        System.out.println(isZeroArray(nums, queries) ? "True" : "False");

    }
}
