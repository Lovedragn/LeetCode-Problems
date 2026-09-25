public class Leet_1658 {
    public static int minOperations(int[] nums, int x) {
        int total = -x;
 
        for (int i : nums) {
            total += i;
        }

        int best = -1;
        int s = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            s += nums[j];
            while(s > total){
                s -= nums[i++];
            }

            if(s == total){
                best = Math.max(j - i  +1, best);
            }
        }
        return best < 0 ? -1 : nums.length - best;

    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[] { 1, 2, 3, 4, 3, 2, 1 }, 5));
    }
}