import java.util.*;

public class Leet_77 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), 1, k, n);
        return res;
    }

    public static void helper(List<List<Integer>> res, List<Integer> temp, int start, int k, int n) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) {
            temp.add(i);
            helper(res, temp, i + 1, k, n); // move to next number
            temp.remove(temp.size() - 1);   // backtrack
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 3));
    }
}