import java.util.ArrayList;
import java.util.List;

public class Leet_1863 {
    public static int subsetXORSum(int[] nums) {
        return helper(nums, 0 , new ArrayList<>());
        
    }

    public static int helper(int[] nums, int index , List<Integer> list) {
        if (index == nums.length) {
            int cac = 0;
            for (Integer integer : list) {
                cac ^= integer; 
            }
            return cac;
        }
        //pick
         list.add(nums[index]); 
        int pick = helper(nums, index+1 , list);
        list.remove(list.size()-1);
        int noPick = helper(nums, index+1 , list);
        return pick + noPick;
    }

    public static void main(String[] args) {
        int[] nums = { 5,1,6};
        System.out.println(subsetXORSum(nums));
    }
}