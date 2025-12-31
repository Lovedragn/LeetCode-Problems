import java.util.*;

public class Leet_2110 {
    public static Set<List<Integer>> set;

    public static long getDescentPeriods(int[] prices) {
        set = new HashSet<>();
        dfs(prices, 0, new LinkedList<>());

        
        System.out.println(set); // print subsequences
        return set.size() > prices.length ? set.size() : prices.length; // if no subsequences found, return length of prices
    }

    public static void dfs(int[] prices, int index, List<Integer> list) {
        if (index == prices.length) return;

        for (int i = index; i < prices.length; i++) {
            if (list.isEmpty() || list.get(list.size() - 1) - prices[i] == 1) {
                list.add(prices[i]);
                set.add(new LinkedList<>(list)); // store copy
                dfs(prices, i + 1, new LinkedList<>(list)); // continue with copy
                list.remove(list.size() - 1); // backtrack
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,6,7,7};
        System.out.println(getDescentPeriods(arr)); // Expected: 7
    }
}