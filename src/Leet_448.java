
import java.util.*;

public class Leet_448 {

        public static List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> list = new ArrayList<>();

            Set<Integer> set = new HashSet(); //1 2 3 4   6 7 8
            for(int elem : nums){
                set.add(elem);
            } 

            for (int i = 1; i <= nums.length; i++) {
                if (!set.contains(i)) {
                    list.add(i);
                }
            }
            return list;
        }

    public static void main(String args[]) {
        int arr[] = {1, 1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
