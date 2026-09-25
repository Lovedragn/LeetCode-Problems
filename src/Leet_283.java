
public class Leet_283 {

    public static void moveZeroes(int[] nums) {
        int l = 0;
        int r = l + 1;
        if (nums.length > 1) {
            while (r < nums.length) {
                if (nums[l] == 0) {
                    if (nums[r] != 0) {
                    
                        int temp = nums[l];
                        nums[l] = nums[r];
                        nums[r] = temp;
                        l++;
                        r++;
                    }else{
                        r++;
                    }
                }else{
                    r++;l++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 4, 5};
        moveZeroes(arr);
        for (int elem : arr) {
            System.out.print(elem+" ,");
        }
    }
}
