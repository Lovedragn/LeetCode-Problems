import java.util.*;
import java.util.PriorityQueue;

public class Leet_1046 {

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            q.offer(stone);
        }

        int initial = q.poll();//7
        while(!q.isEmpty()) {
            int helper = q.poll();//3 2
            initial = Math.abs(initial - helper);//4 2 
        }

        return initial;
    }

    public static void main(String args[]) {
        int[] stones = { 3,7, 2 };
        System.out.println(lastStoneWeight(stones));
    }
}
