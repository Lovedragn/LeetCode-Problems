
import java.util.*;

public class Leet_217 {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(nums).boxed().toList());

        return set.size() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
