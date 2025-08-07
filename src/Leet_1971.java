import java.util.*;
public class Leet_1971 {

    public static boolean trigger = false;

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        trigger = false;
        boolean visited[] = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        adj_form(edges, adj);
        helper(destination, source, adj, visited);

        return trigger;
    }

    public static void helper(int dex, int index, List<List<Integer>> adj, boolean[] visited) {
        if (trigger) return;

        visited[index] = true;

        for (Integer list : adj.get(index)) {
            if (list == dex) {
                trigger = true;
                return;
            }
            if (!visited[list]) {
                helper(dex, list, adj, visited);
            }
        }
    }

    public static void adj_form(int[][] edges, List<List<Integer>> adj) {
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
    }


    public static void main(String args[]) {
        int n = 6;
        int arr[][] = { { 0, 1 }, { 0, 2 }, { 3, 5 }, { 5, 4 }, { 4, 3 } };
        System.out.println(validPath(n, arr, 0, 5));
    }
}