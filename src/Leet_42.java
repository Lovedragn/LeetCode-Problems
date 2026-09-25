
public class Leet_42 {

    public static int trap(int[] height) {
        int result = 0;
        int l = 1;
        int r = height.length - 2;
        int lm = height[0];
        int rm = height[height.length - 1];

        while (l <= r) {
            if (lm <= rm) {
                if (height[l] >= lm) {
                    lm = height[l];
                } else {
                    int calc = lm - height[l];
                    result += calc;
                }
                l++;
            } else {
                if (height[r] >= rm) {
                    rm = height[r];
                } else {
                    int calc = rm - height[r];
                    result += calc;
                }
                r--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 3};
        System.out.println(trap(height));
    }
}
