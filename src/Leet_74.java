
public class Leet_74 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length-1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int inner_l = 0;
            int inner_r = matrix[mid].length-1;

            if (matrix[mid][0] <= target && matrix[mid][inner_r] >= target) {
                
                while (inner_l <= inner_r) {
                    int inner_mid = inner_l + (inner_r - inner_l) / 2;
                    if (matrix[mid][inner_mid] == target) {
                        return true;
                    } else if (matrix[mid][inner_mid] > target) {
                        inner_r = inner_mid-1;
                    } else if (matrix[mid][inner_mid] < target) {
                        inner_l = inner_mid + 1;
                    }
                }
            } else if (matrix[mid][0] >= target) {
                r = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(arr, 1));
    }
}
