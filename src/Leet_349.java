
    import java.util.*;

    public class Leet_349 {

        public static int[] intersection(int[] nums1, int[] nums2) {

            Set<Integer> set = new HashSet<>();//3
            for (int elem : nums1) {
                set.add(elem);
            }

            Set<Integer> res = new HashSet<>();

            for (int i = 0; i < nums2.length; i++) {
                if (set.contains(nums2[i])) {
                    res.add(nums2[i]);
                }
            }

            int finals[] = new int[res.size()];

            int l = 0;
            for (int elem : res) {
                finals[l] = elem;
                l++;
            }

            return finals;
        }

        public static void main(String[] args) {
            int[] arr1 = {4, 9, 5};
            int[] arr2 = {9, 4, 9, 8, 4};
            int res[] = intersection(arr1, arr2);
            for (int elem : res) {
                System.out.print(elem + " ");
            }
        }
    }
