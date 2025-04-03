
public class Leet_35 {

    public static int searchInsert(int[] nums, int target) {

        int l = 0;
        int r = nums.length ;
        int mid = l + (r - l) / 2;

        while (l < r) {
            mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid;

            } else {
                l = mid + 1;
            }
        }
        if(nums[mid] > target){
            return mid;
        }else{
            return mid+1;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6, 7};
        int target = 0;
        System.out.println(searchInsert(nums, target));

    }
}
