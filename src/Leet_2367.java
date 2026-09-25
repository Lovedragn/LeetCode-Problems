import java.util.*;

public class Leet_2367 {

    public static int arithmeticTriplets(int[] nums, int diff) {
        int res = 0;

        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : nums) {
            set.add(integer);
        }

        for (Integer i : nums) {
            if(set.contains(diff + i) && set.contains((diff*2) + i)){
                res++;

            }
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 4, 6, 7, 10 };
        System.out.println(arithmeticTriplets(arr, 3));
    }
}
