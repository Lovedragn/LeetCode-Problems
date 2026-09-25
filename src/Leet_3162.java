
public class Leet_3162 {

        public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
            int res = 0;
            // left -> bigger rightr -> smaller
            //nums2[j] * K

            for(int j : nums2){
                int cal = j * k;
                for (int i : nums1) {
                    //even
                    if (i % cal == 0) {
                        res++;
                    }//odd
                }
            }

            return res;
        }

    public static void main(String[] args) {
        int[] nums1 = {1,2,4,12};
        int[] nums2 = {2,4};
        System.out.println(numberOfPairs(nums1, nums2, 3));
    }
}
