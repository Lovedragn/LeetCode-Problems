public class Leet_1266 {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            int[] temp2 = points[i];
            int[] temp1 = points[i - 1];

            // Chebyshev distance
            int dx = Math.abs(temp2[0] - temp1[0]);
            int dy = Math.abs(temp2[1] - temp1[1]);
            res += Math.max(dx, dy);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] points = { { 3, 2 }, { -2, 2 } };
        System.out.println(minTimeToVisitAllPoints(points)); // Output: 5
    }
}