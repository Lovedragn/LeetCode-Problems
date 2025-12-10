public class Quest_1 {

    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[i + nums.length] = nums[i];
            arr[i] = nums[i];
        }
        return arr;
    }

    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int help = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res[i] = nums[i - help];
            res[i + 1] = nums[n + help];
            help++;
        }
        return res;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                continue;
            }
            res = Math.max(res, i - l);
            l = i + 1;
        }
        // Final check for trailing ones
        res = Math.max(res, nums.length - l);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1, 0, 1 };
        Quest_1 obj = new Quest_1();
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
}
