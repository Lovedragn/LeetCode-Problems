public class Leet_3942 {
    public static int minOperations(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int idx0 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (0 == nums[i]) {
                idx0 = i;
                break;
            }
        }
        int n = nums.length;
        // is asc
        boolean isasc = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[(i + idx0) % n] != i) {
                isasc = false;
                break;
            }
        }

        if (isasc) {
            if (idx0 == 0)
                return 0;

            return Math.min(idx0, (n - idx0) + 2);
        }

        // is Desc
        boolean isdesc = true;
        for (int i = 0; i < n; i++) {
            if (nums[(idx0 - i + n) % n] != i) {
                isdesc = false;
                break;
            }
        }
        // 3 2 1 0
        if (isdesc) {
            int cost1 = ((idx0 + 1) % n) + 1;
            int cost2 = 1 + (n - 1 - idx0);

            return Math.min(cost1, cost2);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, 1 };
        System.out.println(minOperations(arr));
    }
}
