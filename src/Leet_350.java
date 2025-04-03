
import java.util.*;

public class Leet_350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int elem : nums1) {
            map.put(elem,map.getOrDefault(elem, 0)+1);
        }
        List<Integer> list = new ArrayList<>();

        for (int elem : nums2) {
            if (map.containsKey(elem) && map.get(elem) >= 1) {
                map.put(elem, map.getOrDefault(elem, 0)-1);
                list.add(elem);
            }
        }
        int res[] = new int[list.size()];
        int i=0;
        for (int elem : list) {
            res[i] = elem;
            i++;
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        int res[] = intersect(arr1, arr2);
        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }
}
