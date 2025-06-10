import java.util.*;
import java.util.PriorityQueue;

public class Leet_1046 {

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            q.offer(stone);
        }

        while (q.size() > 1) {
            int initial = q.poll();// 7
            int helper = q.poll();// 3 2
            int diff = Math.abs(initial - helper);// 4 2
            if (diff != 0) {
                q.offer(diff);
            }
        }

        return q.isEmpty() ? 0 : q.poll();
    }

    public static void main(String args[]) {
        int[] stones = { 3, 7, 2 };
        System.out.println(lastStoneWeight(stones));
    }
}
