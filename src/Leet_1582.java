public class Leet_1582 {
    public static int numSpecial(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];

        // Count 1s in each row and column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int res = 0;
        // Check special positions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 0 } };
        System.out.println(numSpecial(arr)); // Output: 1
    }
}