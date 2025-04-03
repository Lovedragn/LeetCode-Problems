
public class Leet_88 {

        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int n_idx = n - 1;
            int m_idx = m - 1;
            int last = n + m - 1;

            while (n_idx >= 0) {
                if (m_idx >= 0 && nums1[m_idx] > nums2[n_idx]) {
                    nums1[last] = nums1[m_idx];
                    m_idx--;
                } else {
                    nums1[last] = nums2[n_idx];
                    n_idx--;
                }
                last--;
            }
        }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int n = 3, m = 3;
        merge(nums1, m, nums2, n);
        for (int elem : nums1) {
            System.out.print(elem + " ");
        }
    }
}
