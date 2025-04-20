
import java.util.*;

public class Leet_781 {

    public static int numRabbits(int[] answers) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int elem : answers) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }
        for (Integer elem : map.keySet()) {
            int size = elem+1;
            int rabbit_said = map.get(elem);

            res += (Math.ceil((double) rabbit_said/ size))*size;
        }

        return res;
    }

    public static void main(String args[]) {
        int arr[] = {0, 0, 1, 1, 1};
        System.out.println(numRabbits(arr));

    }
}
