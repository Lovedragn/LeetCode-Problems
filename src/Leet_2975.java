import java.util.*;

public class Leet_2975 {
    public static int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        final int MOD = 1_000_000_007;

        // Add boundaries
        int[] h = new int[hFences.length + 2];
        int[] v = new int[vFences.length + 2];

        h[0] = 1; h[h.length - 1] = m;
        v[0] = 1; v[v.length - 1] = n;

        for (int i = 0; i < hFences.length; i++) h[i + 1] = hFences[i];
        for (int i = 0; i < vFences.length; i++) v[i + 1] = vFences[i];

        Arrays.sort(h);
        Arrays.sort(v);

        // Compute all horizontal differences
        Set<Integer> hDiffs = new HashSet<>();
        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                hDiffs.add(h[j] - h[i]);
            }
        }

        // Compute vertical differences and check intersection
        int maxSide = -1;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int diff = v[j] - v[i];
                if (hDiffs.contains(diff)) {
                    maxSide = Math.max(maxSide, diff);
                }
            }
        }

        if (maxSide == -1) return -1;
        long area = (long) maxSide * maxSide % MOD;
        return (int) area;
    }

    public static void main(String[] args) {
        int m = 4, n = 3;
        int[] hFences = {2, 3};
        int[] vFences = {2};
        int result = maximizeSquareArea(m, n, hFences, vFences);
        System.out.println(result); // Expected output: 4
    }
}