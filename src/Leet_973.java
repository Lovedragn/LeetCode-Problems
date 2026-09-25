import java.util.PriorityQueue;
import java.util.*;

public class Leet_973 {
    // ~formula sqrt((x1 + x2)^2+(y1 + y2)^2)

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]> q = new PriorityQueue<>((a, b) -> Double.compare(a[0], b[0]));

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            double formula = Math.sqrt((x * x) + (y * y));

            q.offer(new double[] { formula, x, y });

        }

        int res[][] = new int[k][2];
        for (int i = 0; i < k; i++) {
            double[] temp = q.poll();
            int x = (int) temp[1];
            int y = (int) temp[2];
            res[i] = new int[] { x, y };
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[][] = { {3,3},{5,-1},{-2,4} };
        int res[][] = kClosest(arr, 2);

        for (int[] ress : res) {
            for (int resss : ress) {
                System.out.print(resss + " ,");
            }
            System.out.println();
        }
    }
}
