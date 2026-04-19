
public class Leet_1855 {

    public static int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0, res = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                res = Math.max(res, j - i);
                j++;
            } else {
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = { 55, 30, 5, 4, 2 };
        int[] nums2 = { 100, 20, 10, 10, 5 };
        System.out.println(maxDistance(nums1, nums2));
    }
}