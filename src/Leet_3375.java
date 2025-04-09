
import java.util.*;

public class Leet_3375 {

    public static int minOperations(int[] nums, int k) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int elem : nums) {
            if (elem < k) {
                return -1;
            } else if(elem > k) {
                map.put(elem, map.getOrDefault(elem, 0) + 1);
            }
        }
        res = map.size(); 
        return res;
    }

    public static void main(String args[]) {
        int[] nums1 = {5, 2, 5, 4, 5}; //2
        int k1 = 2;
        System.out.println(minOperations(nums1, k1));

    }
}
