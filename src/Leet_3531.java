import java.util.*;

public class Leet_3531 {
    public static int countCoveredBuildings(int n, int[][] buildings) {
        // Store building positions in a HashSet
        Set<String> set = new HashSet<>();
        for (int[] b : buildings) {
            set.add(b[0] + "," + b[1]);
        }

        int res = 0;
        for (int[] b : buildings) {
            int i = b[0], j = b[1];

            boolean left  = hasBuildingLeft(i, j, set);
            boolean right = hasBuildingRight(i, j, set, n);
            boolean up    = hasBuildingUp(i, j, set);
            boolean down  = hasBuildingDown(i, j, set, n);

            if (left && right && up && down) {
                res++;
            }
        }
        return res;
    }

    private static boolean hasBuildingLeft(int i, int j, Set<String> set) {
        for (int x = i-1; x >= 0; x--) {
            if (set.contains(x + "," + j)) return true;
        }
        return false;
    }

    private static boolean hasBuildingRight(int i, int j, Set<String> set, int n) {
        for (int x = i+1; x <= n; x++) {
            if (set.contains(x + "," + j)) return true;
        }
        return false;
    }

    private static boolean hasBuildingUp(int i, int j, Set<String> set) {
        for (int y = j-1; y >= 0; y--) {
            if (set.contains(i + "," + y)) return true;
        }
        return false;
    }

    private static boolean hasBuildingDown(int i, int j, Set<String> set, int n) {
        for (int y = j+1; y <= n; y++) {
            if (set.contains(i + "," + y)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] buildings = { {1,2}, {2,2}, {3,2}, {2,1}, {2,3} };
        System.out.println(countCoveredBuildings(n, buildings)); // Output: 1
    }
}