
public class Leet_80 {

    // public static int removeDuplicates(int[] nums) {
    //     int result = 0;
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    //     }
    //     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //         int calc = entry.getValue();
    //         if(calc <=2){
    //             result += calc; 
    //         }else{
    //             result +=2;
    //         }
    //     }
    //     return result;
    // }
    public static int[] removeDuplicates(int[] nums) {
        int j = 0;
        int count = 0;
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[j] == nums[i] && count >= 1) {
                
                nums[i] = nums[i+1];
                count = 0;
            } else {
                result++;
                count++;
            }
            if (nums[j] != nums[i]) {
                result++;
            }

            j++;
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        removeDuplicates(nums);
        for (int elem : nums) {

            System.out.print(elem + " ");
        }
    }
}
