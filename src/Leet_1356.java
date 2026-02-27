import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet_1356 {
    public static int[] sortByBits(int[] arr) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        Arrays.sort(arr);

        for (int i : arr) {
            int count = Integer.bitCount(i);
            List<Integer> list = map.getOrDefault(count, new ArrayList<>());
            list.add(i);
            map.put(count, list);
        }

        int[] res = new int[arr.length];
        int idx = 0;
        for (Map.Entry<Integer, List<Integer>> m : map.entrySet()) {
            for (int i : m.getValue()) {
                res[idx] = i;
                idx++;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int res[] = sortByBits(arr);

        for (int i = 0; i < res.length; i++) {

            System.out.println(res[i]);
        }
    }
}
