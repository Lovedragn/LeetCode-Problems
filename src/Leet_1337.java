
import java.util.PriorityQueue;

public class Leet_1337 {

    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        count_soldiers(mat, q);
        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = q.poll()[1];
        }
        return res;
    }

    public static void count_soldiers(int[][] mat, PriorityQueue<int[]> q) {
        for (int i = 0; i < mat.length; i++) {
            int left = 0;
            int right = mat[i].length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (mat[i][mid] == 1) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            q.offer(new int[] { left, i });
        }
    }

    public static void main(String args[]) {
        int[][] mat = { { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };

        int[] res = kWeakestRows(mat, 3);
        for (int n : res) {
            System.out.println(n);
        }
    }
}
