import java.util.Arrays;

public class Leet_3296 {
    public static long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        Arrays.sort(workerTimes);
        int base = mountainHeight / workerTimes.length;
        int extra = mountainHeight % workerTimes.length;

        int[] tasks = new int[workerTimes.length];
        Arrays.fill(tasks, base);
        for (int i = 0; i < extra; i++) {
            tasks[i]++;
        }

        long res = 0;
        for (int i = 0; i < tasks.length; i++) {
            int value = tasks[i];
            long formula = (long) workerTimes[i] * value * (value + 1) / 2;
            res = Math.max(res, formula);
        }
        return res;
    }

    public static void main(String[] args) {
        int mountainHeight = 5;
        int[] workerTimes = {1, 5};
        System.out.println(minNumberOfSeconds(mountainHeight, workerTimes));
    }
}