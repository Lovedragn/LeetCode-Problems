public class Leet_3550 {
    public static int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int total = 0;
            while (temp != 0) {
                int last = temp % 10;
                total += last;
                temp /= 10;
            }
            if (total == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        System.out.println(smallestIndex(new int[] { 1, 3, 2 }));
    }
}
