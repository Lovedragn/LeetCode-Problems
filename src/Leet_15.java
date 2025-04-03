
import java.util.*;

public class Leet_15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int m = l + 1;
        int r = nums.length - 1;

        Set<List<Integer>> list = new HashSet<>();

        if (nums.length < 2) {
            return new ArrayList<>();
        }
        while (l < m && m < r) {
            while (m < r) {//-4 -1 -1 0 1 2
                int calc = nums[l] + nums[m] + nums[r];
                if (calc == 0) {
                    list.add(Arrays.asList(nums[l], nums[m], nums[r]));
                    m ++;
                } else if (calc > 0) {
                    r--;
                }else if(calc < 0){
                    m++;
                }else{
                    continue;
                }
            }
            l++;
            m = l + 1;
            r = nums.length - 1;

        }
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        System.out.println(threeSum(nums));
    }
}
