import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leet_347 {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a ,b) -> Integer.compare(b.getValue() , a.getValue()));
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            q.offer(entry);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int val = q.poll().getKey();
            res[i] = val;
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 1,2,1,2,1,2,3,1,3,2 };
        int k = 2;
        int[] res = topKFrequent(nums, k);

        for (int i : res) {
            System.out.println(i);

        }
    }
}
