
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_18 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int l = 0, mid = l + 1, pro = mid + 1, r = nums.length-1;

        while (l < mid) {
            while (mid < pro) {
                while (pro < r) {
                    for (int i = r; i > pro; i--) {
                        int cal = nums[l] + nums[i] + nums[pro]+nums[mid];
                        if (cal == target) {
                        res.add(Arrays.asList(nums[l], nums[mid], nums[pro], nums[i]));


                        }
                    }
                    pro++;
                }
                mid++;
            }
            l++;
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(arr, 0));
    }
}
