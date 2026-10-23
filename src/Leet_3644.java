
public class Leet_3644 {
    public static int sortPermutation(int[] nums) {
        int res = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                res &= nums[i];
            }
        }

        return Math.max(res, 0);
    }

    public static void main(String args[]) {
        int arr[] = { 0, 5, 2, 7, 4, 1, 6, 3 };
        System.out.println(sortPermutation(arr));
    }
}
