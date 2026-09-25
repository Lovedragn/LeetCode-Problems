public class Leet_922 {
    public static int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        while (even < nums.length && odd < nums.length) {
            if(nums[even] % 2 == 0){
                even+=2;
            }else if(nums[odd] % 2 == 1){
odd+=2;
            }else{
                swap(even , odd , nums);
            }
          }
        return nums;
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 7 };
        int res[] = sortArrayByParityII(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
