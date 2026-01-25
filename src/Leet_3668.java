import java.util.HashMap;
import java.util.Map.Entry;

public class Leet_3668 {
    public static int[] recoverOrder(int[] order, int[] friends) {
        int news[] = new int[friends.length];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            map.put( friends[i],i);
        }
        int ii=0;
        for (int i : order) {
            if(map.containsKey(i)){
                news[ii] = i;
                ii++;
            }
        }
        return news;

    }

    public static void main(String args[]) {
        int[] order = { 3, 1, 2, 5, 4 };
        int[] friends = { 1, 3, 4 };

        int res[] = recoverOrder(order, friends);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
