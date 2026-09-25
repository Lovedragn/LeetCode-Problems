import java.util.PriorityQueue;

public class Leet_215 {
     public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int num : nums){
            q.offer(num);
            if(q.size() > k){
                q.poll();
            }
        }
        return q.poll();
    }
    public static void main(String[] args){
        int[] nums = {5,2,3,4,1};
        System.out.println(findKthLargest(nums, 2)); // 4  
    }
}
