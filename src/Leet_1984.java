import java.util.Arrays;

public class Leet_1984 {
    public static int minimumDifference(int[] nums, int k) {
        int res =Integer.MAX_VALUE;
        Arrays.sort(nums);

        int l =0;
        int r =k-1;

        while(r < nums.length){
            int min = nums[l];
            int max = nums[r];
            res = Math.min(res, max - min);
            l++;
            r++;
        }
        return res;
    }

    public static void main(String args[]) {
        int nums[] = { 9, 4, 1, 7 };//1479
        System.out.println(minimumDifference(nums, 2));
    }
}