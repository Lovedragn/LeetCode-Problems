
public class Leet_11 {

    public static int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            int min = Math.min(height[l],height[r]);
            int calc = min * (r-l);
            if (calc >= max) {
                max = calc;

            }
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }
}
