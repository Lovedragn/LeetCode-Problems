public class Leet_3047 {
    public static long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long res = 0;
        for (int i = 0; i < topRight.length; i++) {
            for (int j = i + 1; j < topRight.length; j++) {
                // Intersection boundaries using your variable names
                int maxX = Math.max(bottomLeft[i][0], bottomLeft[j][0]);   // left boundary
                int minX = Math.min(topRight[i][0], topRight[j][0]);       // right boundary
                int maxY = Math.max(bottomLeft[i][1], bottomLeft[j][1]);   // bottom boundary
                int minY = Math.min(topRight[i][1], topRight[j][1]);       // top boundary

                // Check if intersection exists
                if (minX > maxX && minY > maxY) {
                    int len = Math.min(minX - maxX, minY - maxY);
                    res = Math.max(res, len);
                }
            }
        }
        return res * res;
    }


    public static void main(String args[]) {
        int[][] bottomLeft = { { 1, 1 }, { 2, 2 }, { 3, 1 } }, 
        topright = { { 3, 3 }, { 4, 4 }, { 6, 6 } };

        System.out.println(largestSquareArea(bottomLeft, topright));
    }
}
