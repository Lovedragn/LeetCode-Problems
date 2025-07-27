import java.util.*;

public class Leet_Q3 {
    public static int minimumCardPickup(int[] cards) {
        int res = Integer.MAX_VALUE;
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            if(map.containsKey(cards[i])){
                res = Math.min(res, i - map.get(cards[i]));
            }
            map.put(cards[i], i);
        }
        return res == Integer.MAX_VALUE ? -1: res+1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 3, 4, 7 };// 4
        System.out.println(minimumCardPickup(arr));
    }
}
