import java.util.Arrays;

public class Leet_3296 {
    public static long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        Arrays.sort(workerTimes);

        long left = 0, right = (long) 1e18; // upper bound
        long answer = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canFinish(mountainHeight, workerTimes, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    // Check if workers can finish within 'timeLimit'
    private static boolean canFinish(int mountainHeight, int[] workerTimes, long timeLimit) {
        long total = 0;
        for (int w : workerTimes) {
            // Solve quadratic: w * (k*(k+1))/2 <= timeLimit
            // Find max k tasks this worker can do within timeLimit
            long low = 0, high = (long) 1e9;
            while (low <= high) {
                long mid = (low + high) / 2;
                long cost = (long) w * mid * (mid + 1) / 2;
                if (cost <= timeLimit) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            total += high; // max tasks this worker can handle
            if (total >= mountainHeight) return true;
        }
        return total >= mountainHeight;
    }

    public static void main(String[] args) {
        int mountainHeight = 5;
        int[] workerTimes = {1, 5};
        System.out.println(minNumberOfSeconds(mountainHeight, workerTimes)); // ✅ prints 10
    }
}