import java.util.Collections;
import java.util.PriorityQueue;

public class Leet_1464 {
    public static int maxProduct(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            q.offer(nums[i]);
        }

        return (q.poll()-1)*(q.poll()-1); 
    }

    public static void main(String args[]) {
        int[] nums = { 3, 4, 5, 2 };
        System.out.println(maxProduct(nums)); // Output: 12
    }
}
