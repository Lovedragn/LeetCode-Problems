public class Leet_3637 {

    public static boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 1;
        while (i < n && nums[i - 1] < nums[i]) {
            i++;
        }
        int p = i - 1;
        while (i < n && nums[i - 1] > nums[i]) {
            i++;
        }
        int q = i - 1;
        while (i < n && nums[i - 1] < nums[i]) {
            i++;
        }
        int flag = i - 1;
        return (p != 0) && (q != p) && (flag == n - 1 && flag != q);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 3 };
        System.out.println(isTrionic(arr) ? "T" : "F");
    }
}