

public class Leet_27 {

    public static int removeElement(int[] nums, int val) {

        int fixed = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[fixed] = nums[i];
                fixed++;
            }    
        }
        return fixed;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}
