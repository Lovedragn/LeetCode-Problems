import java.util.HashSet;

public class Leet_874 {
    public static int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0;
        // up-0 down-2 left--1 right-1
        int direction = 0;
        HashSet<String> set = new HashSet<>();
        for (int[] i : obstacles) {
            set.add(i[0] + "," + i[1]);
        }

        int res = 0;
        for (int i : commands) {
            if (i >= 0) {
                for (int j = 0; j < i; j++) {

                    int nx = x, ny = y;

                    if (direction == 0) { // North
                        ny = y + 1;
                    } else if (direction == 2) { // South
                        ny = y - 1;
                    } else if (direction == 1) { // East
                        nx = x + 1;
                    } else { // West
                        nx = x - 1;
                    }
                    if (set.contains(nx + "," + ny)) {
                        break;
                    }

                    x = nx;
                    y = ny;

                    res = Math.max(res, x * x + y * y);
                }
            } else {
                if (i == -1) {
                    // right
                    direction = (direction + 1) % 4;
                } else {
                    // left
                    direction = (direction + 3) % 4;
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 4, -1, 4, -2, 4 };
        int[][] obstacles = { { 2, 4 } };

        System.out.println(robotSim(arr, obstacles));
    }
}