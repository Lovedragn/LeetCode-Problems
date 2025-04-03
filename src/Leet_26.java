

public class Leet_26 {

    public static int removeDuplicates(int[] nums) {
        int fixed = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[fixed-1] != nums[i]) {
                nums[fixed] = nums[i];
                fixed++;
            }
        }
          for (int elem : nums) {
              System.out.println(" => " + elem);

          }
        return fixed+1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
}
