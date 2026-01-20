import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_3314 {
    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] res = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if ((n & 1) == 1) {
                int lowestZeroBit = (n + 1) & ~n;
                int shifted = lowestZeroBit >> 1;
                int mask = ~shifted;
                res[i] = n & mask;
            } else {
                res[i] = -1;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 5, 7));
        int res[] = minBitwiseArray(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
