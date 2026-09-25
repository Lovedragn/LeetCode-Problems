
public class Leet_238 {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
    
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
    
    
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
    
        return result;
    }

    public static void main(String args[]) {
        int arr[] = {0,4,0};
        int res[] = productExceptSelf(arr);
        for (int elem : res) {
            System.out.print(elem + "   ");
        }
    }
}
