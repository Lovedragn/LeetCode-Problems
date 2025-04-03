
import java.util.*;

public class Leet_70 {

    public static int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        return climbStairs(n , map) ;

    }

    public static int climbStairs(int n, HashMap<Integer, Integer> memo) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1 , memo) + climbStairs(n-2 , memo));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
