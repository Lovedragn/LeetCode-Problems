public class Leet_1493 {
    public static int res;

    public static int longestSubarray(int[] nums) {
        res = 0;
        subarray_search(nums, 0, 0, 0, false);
        if(nums.length == res){
            return res-1;
        }
        return res;
    }

    public static void subarray_search(int[] nums, int curr, int prev, int pointer, boolean trigger) {
        if (pointer == nums.length) {
              res = Math.max(curr + prev, res);
            return;
        }
        if ((trigger && nums[pointer] == 0) || pointer == nums.length) {
            res = Math.max(curr + prev, res);
            prev = curr;
            curr = 0;
            trigger = false;
        }

        if (nums[pointer] == 0) {
            trigger = true;
        } else {

            if (trigger && nums[pointer] == 1) {
                curr++;
            } else if (nums[pointer] == 1) {
                prev++;
            }
        }
        subarray_search(nums, curr, prev, pointer + 1, trigger);

    }

    public static void main(String[] args) {
        int arr[] = { 0,0};
        System.out.println(longestSubarray(arr));
    }
}