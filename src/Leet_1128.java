
import java.util.*;

public class Leet_1128 {

    public static int numEquivDominoPairs(int[][] dominoes) {
        int res = 0;
        HashMap< int[], Integer> map = new HashMap<>();
        for (int l = 0; l < dominoes.length; l++) {
            int swap[] = new int[2];
            swap[0] = dominoes[l][1];
            swap[1] = dominoes[l][0];
            
            if (map.containsKey(swap)) {
                map.put(swap, map.getOrDefault(swap, 0) + 1);
            } else {
                map.put(dominoes[l], map.getOrDefault(dominoes[l], 0) + 1);
            }
        }
        for (Integer elem : map.values()) {
            if (elem > 1) {
                res += elem * (elem-1)/2;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {2, 1}, {3, 5}, {1, 2}, {6, 3}};
        System.out.println(numEquivDominoPairs(arr));
    }
}
