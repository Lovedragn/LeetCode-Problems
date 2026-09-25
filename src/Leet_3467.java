

public class Leet_3467 {

    public static int[] transformArray(int[] nums) {

        int res[] = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;

        for (int elem : nums) {
            if (elem % 2 == 0) {
                res[l] = 0;
                l++;
            } else {
                res[r] = 1;
                r--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};
        int res[] = transformArray(arr);
        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }
}
