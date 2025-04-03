
public class Leet_3190 {

    public static int minimumOperations(int[] nums) {
        int res = 0;
        for (int elem : nums) {
            if (elem%3 >= 1) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3,6,9};
        System.out.println(minimumOperations(arr));
    }
}
