public class Leet_1848 {
    public static int getMinDistance(int[] nums, int target, int start) {
        int res = Integer.MAX_VALUE;
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            while (nums[l] != target)
                l++;
            while (nums[r] != target)
                r--;
            res = Math.min(res, Math.min(Math.abs(l - start), Math.abs(r - start)));
            l++;r--;
        }
        return res == Integer.MAX_VALUE?0:res;
    }

    public static void main(String args[]) {
        int[] arr = { 1,1,1,1,1,1,1,1,1,1};
        int target = 1;
        int start = 0;
        System.out.println(getMinDistance(arr, target, start));
    }
}
