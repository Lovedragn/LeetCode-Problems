public class Leet_3689{
    public static long maxTotalValue(int[] nums, int k) {
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : nums){
            Math.max(max , i);
            Math.min(min , i);
        }
        return (max - min) * k;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(maxTotalValue(nums , 2));
    }
}