public class Leet_3512 {
    public static int minOperations(int[] nums, int k) {
        int res = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total+=nums[i];
        }

        res = total % k;
         
        return res;
    }

    public static void main(String args[]) {
        int num[] = { 3, 7, 9 };
        System.out.println(minOperations(num, 5));
    }
}
