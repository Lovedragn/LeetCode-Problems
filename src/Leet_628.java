public class Leet_628 {
    public static int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int x : nums) {
            // Update minimums
            if (x <= min1) {
                min2 = min1;
                min1 = x;
            } else if (x <= min2) {
                min2 = x;
            }

            // Update maximums
            if (x >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x >= max2) {
                max3 = max2;
                max2 = x;
            } else if (x >= max3) {
                max3 = x;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[] {
            -710, -107, -851, 657, -14, -859, 278, -182, -749, 718, -640, 127,
            -930, -462, 694, 969, 143, 309, 904, -651, 160, 451, -159, -316,
            844, -60, 611, -169, -73, 721, -902, 338, -20, -890, -819, -644,
            107, 404, 150, -219, 459, -324, -385, -118, -307, 993, 202, -147,
            62, -94, -976, -329, 689, 870, 532, -686, 371, -850, -186, 87,
            878, 989, -822, -350, -948, -412, 161, -88, -509, 836, -207, -60,
            771, 516, -287, -366, -512, 509, 904, -459, 683, -563, -766, -837,
            -333, 93, 893, 303, 908, 532, -206, 990, 280, 826, -13, 115, -732,
            525, -939, -787
        }));
    }
}