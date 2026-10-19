import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_2089 {
    public static List<Integer> targetIndices(int[] nums, int target) {
        int count =0;
        int target_count =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < target ){
                count++;
            }else if(target == nums[i]){
                target_count++;
            }    
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < target_count; i++) {
            res.add(count+i);
        }
        return res;
    }

    public static void main(String args[]) {
        int[] arr = { 1,2,5,2,3};
        System.out.println(targetIndices(arr, 2));
    }
}