public class Leet_905 {
    public static int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            if(nums[r] % 2 == 0){
                int temp = nums[l];
                nums[l]  = nums[r];
                nums[r] =temp;
                l++;
            }
            r++;
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = { 3, 2, 1, 4 };
        int[] res = sortArrayByParity(nums);

        for (int i : res) {
            System.out.println(i);
        }
    }
}
