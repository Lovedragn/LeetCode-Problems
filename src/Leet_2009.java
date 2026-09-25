import java.util.PriorityQueue;

public class Leet_2009 {
    public static int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<nums.length ;i++){
            q.offer(new int[]{nums[i] , i});
            if(q.size() > k){
                q.poll();
            }
        }

        PriorityQueue<int[]> q2 = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<k ;i++){
            q2.offer(q.poll());
        }

        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i] = q2.poll()[0];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 2,1,3,3};
        int res[] = maxSubsequence(nums, 2);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
