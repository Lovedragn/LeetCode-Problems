import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Leet_3650 {

    public static List<List<int[]>> G;

    private static int dijkstra(int n) {
        final int INF = 1_000_000_000;
        int[] dist = new int[n];
        boolean[] vis = new boolean[n];
        Arrays.fill(dist, INF);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[] { 0, 0 });

        while (!pq.isEmpty()) {
            int u = pq.poll()[1];

            if (vis[u])
                continue;
            vis[u] = true;

            for (int[] e : G.get(u)) {
                int v = e[0];
                int w = e[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.offer(new int[] { dist[u] + w, v });
                }
            }
        }

        return dist[n - 1] == INF ? -1 : dist[n - 1];
    }

    public static int minCost(int n, int[][] edges) {
        G = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            G.add(new ArrayList<>());

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            G.get(u).add(new int[] { v, w });
            G.get(v).add(new int[] { u, 2 * w });
        }

        return dijkstra(n);
    }

    public static void main(String args[]) {
        int arr[][] = { { 0, 1, 3 }, { 3, 1, 1 }, { 2, 3, 4 }, { 0, 2, 2 } };
        System.out.println(minCost(4, arr));
    }
}
