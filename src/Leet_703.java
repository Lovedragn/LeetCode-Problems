import java.util.*;


public class Leet_703 {
    public static PriorityQueue<Integer> q ;
    public static Integer K;
    public  void  KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        K = k;
        for(int i : nums){
            q.offer(i);
            if(q.size() > k){
                q.poll();
            }
        }
    }   
    
    public static int add(int val) {
        q.offer(val);
        if(q.size() > K){
            q.poll();
        }
        return q.peek();        
    }
    public static void main(String args[]){
        Leet_703 init = new Leet_703();
        init.KthLargest(3 , new int[]{1,2,3,4,5});
        System.out.println(add(30));
    }
}
