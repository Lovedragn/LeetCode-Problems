import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Leet_2913 {
    public static int sumCounts(List<Integer> nums) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            HashSet<Integer> set = new HashSet<>();
            int prev = 0;
            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));
                if (set.size() != prev) {
                    res += set.size() * set.size();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,  1);
        System.out.println(sumCounts(arr));
    }
}