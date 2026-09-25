
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leet_2032 {

        public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            HashSet set1 = new HashSet<>();
            HashSet set2 = new HashSet<>();
            HashSet set3 = new HashSet<>();

            HashSet result = new HashSet<>();
            for (int elem : nums1) {
                set1.add(elem);
            }
            
            for(int i=0;i< nums2.length;i++){
                if(set1.contains(nums2[i])){
                    result.add(nums2[i]);
                } 
                set2.add(nums2[i]);

            }
            for(int i=0;i< nums3.length;i++){
                if(set2.contains(nums3[i]) || set1.contains(nums3[i])){
                    result.add(nums3[i]);
                } 
                set3.add(nums3[i]);

            }
            return new ArrayList<>(result);
        }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));

    }
}
