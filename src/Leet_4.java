
public class Leet_4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0;
        int lengths = nums1.length + nums2.length;
        int down = 0;
        int up = 0;
        int i = 0;
        int[] temp = new int[lengths];

        while (up < nums1.length || down < nums2.length) {

            if (up < nums1.length && (down >= nums2.length || nums1[up] <= nums2[down])) {
                temp[i] = nums1[up];
                up++;
            } else if (down < nums2.length) {
                temp[i] = nums2[down];
                down++;
            }
            i++;
        }

        if (lengths % 2 == 0) {
            res = ((double) temp[(lengths - 1) / 2] + (double) temp[(lengths) / 2]) / 2;
        } else {
            res = (double) temp[(lengths - 1) / 2];
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = {1, 3};
        int arr2[] = {2};
        System.out.println(findMedianSortedArrays(arr, arr2));
    }
}
