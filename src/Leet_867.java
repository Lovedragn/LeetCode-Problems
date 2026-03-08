public class Leet_867 {
    public static int[][] transpose(int[][] matrix) {
      
        int res[][] = new int[matrix[0].length][matrix.length];
        for (int l = 0; l < matrix.length; l++) {
            for (int r = 0; r < matrix[0].length; r++) {
                res[r][l] = matrix[l][r];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 } };
        System.out.println(transpose(arr));
    }
}
