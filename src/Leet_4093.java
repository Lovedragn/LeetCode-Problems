import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Leet_4093 {
    public static long maximizeSum(int[] nums, int k) {
        long res = 0;
        Long remaining[] = new Long[nums.length];
        PriorityQueue<Integer[]> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            res+= nums[i];
            long l = counter(nums[i]);
            remaining[i] = l - nums[i];
        }
        Arrays.sort(remaining ,(a,b)->Long.compare(b,a));
        int i=0;
        while(k >0){
            res+=remaining[i++];
            k--;
        }
        return res;
    }

    private static long counter(int val) {
        String s = String.valueOf(val);
        char chars[] = s.toCharArray();
        Arrays.sort(chars); 
        long cal = Long.parseLong(new StringBuilder(new String(chars)).reverse().toString());
        return cal;
    }

    public static void main(String[] args) {
        System.out.println(maximizeSum(new int[] { 102, 90, 14 }, 2));
    }
}
