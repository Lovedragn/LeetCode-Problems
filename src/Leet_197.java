public class Leet_197 {

    public static long maxMatrixSum(int[][] matrix) {
        int negativeCount = 0;
        long total = 0L; // long to avoid overflow
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { // use row's length
                int value = matrix[i][j];
                if (value < 0) {
                    negativeCount++;
                }
                int abs = Math.abs(value);
                total += abs; // accumulate in long
                minAbs = Math.min(minAbs, abs);
            }
        }

        if (negativeCount % 2 == 0) {
            return total;
        } else {
            return total - 2L * minAbs; // adjust in long
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { -1, 0, -1 }, { -2, 1, 3 }, { 3, 2, 2 } };
        System.out.println(maxMatrixSum(arr));
    }
}