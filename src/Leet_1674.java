public class Leet_1674 {
    public static int res;

    public static int minMoves(int[] nums, int limit) {
        res = Integer.MAX_VALUE;
        recursion(nums, limit, 0, nums[0] + nums[nums.length - 1], 0);
        return res;
    }

    public static void recursion(int[] nums, int limit, int index, int current, int count) {
        if (res == 0) {
            return;
        }
        for (int i = 0; i < nums.length / 2; i++) {
            int l = nums[i];
            int r = nums[nums.length - 1 - i];

            if (current != l + r) {
                int reverver = l + r - current;// -1
                count += 2;

                if (reverver >= 0) {
                    if (r >= l) {
                        int taker = Math.abs(reverver - r );
                        reverver -= taker;
                        // nums[nums.length-i-1] -= taker;
                        if (reverver == 0) {
                            count--;
                        }
                        // nums[i] -= reverver;
                    } else {
                        int taker = reverver - l ;
                        reverver -= taker;
                        // nums[i] -= taker;
                        if (reverver == 0) {
                            count--;
                        }
                        // nums[nums.length - i - 1] -= reverver;
                    }
                } else if (reverver < 0) {
                    if (r <= l) {
                        int taker = Math.abs(reverver + r );
                        reverver += taker;
                        // nums[nums.length - i - 1] += taker;
                        if (reverver == 0) {
                            count--;
                        }
                        // nums[i] += reverver;
                    } else {
                        int taker = Math.abs(reverver + l );
                        reverver += taker;
                        // nums[i] += taker;
                        if (reverver == 0) {
                            count--;
                        }
                        // nums[nums.length - i - 1] += reverver;
                    }
                }

            }
        }

        res = Math.min(res, count);
        for (int j = index + 1; j < nums.length/2; j++) {
            recursion(nums, limit, j, nums[j] + nums[nums.length - 1 - j], 0);
        }
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 4,3 };
        int limit = 4;
        System.out.println(minMoves(nums, limit));
    }
}