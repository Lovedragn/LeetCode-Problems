import java.util.*;

public class Leet_3487 {
    public static int maxSum(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> set = new HashMap<>();
        int neg = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (!set.containsKey(integer) && integer > 0) {

                res += integer;

                set.put(integer, integer);
            }
            if (integer <= 0) {
                neg = Math.max(neg, integer);
            }

        }

        return res <= 0 ? neg : res;
    }

    public static void main(String args[]) {
        int arr[] = { -100 , -2 };
        System.out.println(maxSum(arr));
    }
}
