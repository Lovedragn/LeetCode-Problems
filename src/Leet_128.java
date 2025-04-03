
import java.util.*;

public class Leet_128 {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> map = new HashSet<>();
        for (int elem : nums) {
            map.add(elem);
        }
        int result = 0;

        for (int elem : map) {
            int calc = elem - 1;
            if (!map.contains(calc)) {
                int l = 1;
                while (map.contains(elem + l)) {
                    l++;
                }
                result = Math.max(l, result);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, -1};//5
        System.out.println(longestConsecutive(nums));
    }
}
