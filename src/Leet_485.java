
public class Leet_485 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int l = 0;
        int count = 0;

        while(l < nums.length) {
            if (nums[l] == 0) {
                count = 0;
            }
            if (nums[l] == 1) {
                count++;
            }
            res = Math.max(res, count);
            l++;
        }
        return res;
    }

    public static void main(String[] algs) {
        int all[] = {1, 1, 0, 0, 1, 1, 1, 0, 0};
        System.out.println(findMaxConsecutiveOnes(all));
    }
}
