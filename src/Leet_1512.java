
public class Leet_1512 {

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int l = 0;
        int r = nums.length-1;
        while (l <= r) {
            if (l == r) {
                l++;
                r = nums.length-1;
                continue;
            }
            if (nums[l] - nums[r] == 0) {
                count++;
            }
            r--;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(arr));
    }
}
