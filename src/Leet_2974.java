import java.util.*;

public class Leet_2974 {
    public static int[] numberGame(int[] nums) {
        int res[] = new int[nums.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            q.offer(nums[i]);
        }
        int index = 0;
        while (!q.isEmpty()) {
            int second = q.poll();
            int first = q.poll();
            res[index] = first;
            res[index + 1] = second;
            index += 2;
        }
        return res;
    }

    public static void main(String args[]) {
        int[] res = { 5, 4, 2, 3 };
        int[] ress = numberGame(res);
        for (int i : ress) {
                System.out.println(i);
        }
    }
}
