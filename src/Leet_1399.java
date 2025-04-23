
import java.util.*;

public class Leet_1399 {

    public static int countLargestGroup(int n) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        if (n < 10) {
            return n;
        }
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            int k = i;
            while (k != 0) {
                temp += k % 10;
                k = k / 10;
            }
            map.put(temp, map.getOrDefault(temp, 0) + 1);

        }

        int maxes = Collections.max(map.values());
        for (int elem : map.values()) {
            if (maxes == elem) {
                res++;
            }

        }
        return res;
    }

    public static void main(String args[]) {
        int n = 33;
        System.out.println(countLargestGroup(n));
    }
}
