
import java.util.*;

public class Leet_1929 {

    public static int[] getConcatenation(int[] nums) {

        int[] copy = Arrays.copyOf(nums, nums.length * 2);

        for (int i = nums.length; i < (nums.length * 2); i++) {
            copy[i] = nums[i - nums.length];
        }
        return copy;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 3};
        int[] res = getConcatenation(nums);
        for (int elem : res) {
            System.out.println(elem + " ");
        }
    }
}
