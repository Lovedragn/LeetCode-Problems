public class Leet_3903 {

    public static int firstStableIndex(int[] nums, int k) {
        int max[] = new int[nums.length];
        max[0] = nums[0];

        for (int i = 1; i < max.length; i++) {
            max[i] = Math.max(nums[i], max[i - 1]);
        }

        int smallest = nums[nums.length - 1];

        int count = -1;
        for (int i = max.length - 1; i >= 0; i--) {
            smallest = Math.min(smallest, nums[i]);
            int cal = max[ i] - smallest;
            if (cal <= k)
                count = i;
        }

        return count;
    }

    // [3,2,1], k = 1
    // 3 3 3
    // 1 1 1

    // 5,0,1,4], k = 3
    // 5 5 5 5
    // 0 0 1 4
    public static void main(String args[]) {
        int num[] = {5,0,1,4 };
        int k = 3;
        System.out.println(firstStableIndex(num, k));
    }
}
