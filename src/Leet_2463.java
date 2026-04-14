import java.util.*;

public class Leet_2463 {

    public static long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> Integer.compare(a[0], b[0]));
        List<Integer> factoryPositions = new ArrayList<>();
        for (int[] f : factory) {
            for (int i = 0; i < f[1]; i++)
                factoryPositions.add(f[0]);
        }
        int n = robot.size(), m = factoryPositions.size();
        long[][] dp = new long[n + 1][m + 1];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);
        return solve(0, 0, robot, factoryPositions, dp);
    }

    public static long solve(int r, int f, List<Integer> robot, List<Integer> factory, long[][] dp) {
        if (r == robot.size())
            return 0;
        if (f == factory.size())
            return (long) 1e15;
        if (dp[r][f] != -1)
            return dp[r][f];
        long assign = Math.abs(robot.get(r) - factory.get(f)) + solve(r + 1, f + 1, robot, factory, dp);
        long skip = solve(r, f + 1, robot, factory, dp);
        return dp[r][f] = Math.min(assign, skip);
    }

    public static void main(String[] args) {
        List<Integer> robot = Arrays.asList(0, 4, 6);
        int[][] factory = {{2, 2}, {6, 2}};
        System.out.println(minimumTotalDistance(robot, factory));
    }
}
