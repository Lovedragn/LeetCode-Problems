
public class Leet_1920 {

    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int idx = nums[i];
            res[i] = nums[idx];
        }
        return re
    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 5, 3, 4};
        int res[] = buildArray(arr);
        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }
}
