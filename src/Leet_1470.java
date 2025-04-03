
public class Leet_1470 {

    public static int[] shuffle(int[] nums, int n) {
        int res[] = new int[n * 2];

        int l = 0;
        int r = n;

        for (int i = 0; i < nums.length; i = i + 2) {

            res[i] = nums[l];
            res[i + 1] = nums[r];
            l++;r++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int[] res = shuffle(arr, 4);
        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }

}
