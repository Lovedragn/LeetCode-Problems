import java.util.*;

public class Leet_797 {
   public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0); // Start from node 0
        dfs(graph, 0, path, result);
        return result;
    }

    private static void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> result) {
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path)); // Found a valid path
            return;
        }

        for (int neighbor : graph[node]) {
            path.add(neighbor);
            dfs(graph, neighbor, path, result);
            path.remove(path.size() - 1); // Backtrack
        }
    }
    public static void main(String args[]) {
        int arr[][] = { { 4,3,1}, { 3,2,4 }, { 3 }, {4},{} };

        System.out.println(allPathsSourceTarget(arr));
    }
}