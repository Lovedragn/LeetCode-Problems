import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leet_961 {
    public static int repeatedNTimes(int[] nums) {
        int res =0;
        HashSet< Integer> set = new HashSet<>();
        for (int i:nums) {
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return res;
    }
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5 ,1};
        System.out.println(repeatedNTimes(nums));
        
    }
}
