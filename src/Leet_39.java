import java.util.*;

public class Leet_39 {
    private static List<List<Integer>> res;

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        helper(candidates, target, new ArrayList<>() ,0);
        return res;
    }

    public static void helper(int[] candidates, int target, List<Integer> total , int index) {
        if (0 == target) {
            res.add(new ArrayList<>(total));
            return;
        }
        if(target < 0) return;
        for (int i = index; i < candidates.length; i++) {
              if (target < candidates[i]) {
            continue;
        }
            total.add(candidates[i]);
            helper(candidates, target - candidates[i], total , i);
           
            total.remove(total.size()-1);
           
        }
    }

    public static void main(String args[]) {
        int[] candidates = { 2, 3, 6, 7 };
        System.out.println(combinationSum(candidates, 7));
    }
}
