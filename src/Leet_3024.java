
public class Leet_3024 {

    public static String triangleType(int[] nums) {
        int l = 0;
        int max = 0;
        int container = 0;
        int former = 0;
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }
        for (int i = 0; i < nums.length; i++) {
            max += nums[i];
        }
        while (l != 2) {
            int r = nums.length - 1;
            while (l < r) {
                int temp = nums[l] + nums[r];
                if (temp > max - temp) {
                    container++;
                }
                if (nums[l] == nums[r]) {
                    former++;
                }
                r--;
            }
            l++;
        }
        if (container <= 2) {
            return "none";
        }
        if (former == 1) {
            return "isosceles";
        } else if (former == 0) {
            return "scalene";
        }
        return "none";
    }

    public static void main(String args[]) {
        int arr[] = {3, 3, 7};
        System.out.println(triangleType(arr));
    }
}
