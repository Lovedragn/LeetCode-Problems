
public class Leet_189 {

    public static void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];

        int calc = k % nums.length; // 2

        for (int i = 0; i < nums.length; i++) {
            arr[(calc + i) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; // 3 4 5 1 2
        int k = 2;
        rotate(nums, k);
        for (int elem : nums) {
            System.out.print(elem + " ");
        }
    }
}
