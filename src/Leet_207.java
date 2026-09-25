import java.util.*;

public class Leet_207 {
    public static HashMap<Integer, List<Integer>> map;

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] pair : prerequisites) {
            map.get(pair[0]).add(pair[1]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(i, visited, recStack)) {
                return false;
            }
        }

        return true;
    }

    public static boolean hasCycle(int node, boolean[] visited, boolean[] recStack) {
        if (recStack[node])
            return true;
        if (visited[node])
            return false;

        visited[node] = true;
        recStack[node] = true;

        for (int neighbor : map.get(node)) {
            if (hasCycle(neighbor, visited, recStack)) {
                return true;
            }
        }

        recStack[node] = false;
        return false;
    }

    public static void main(String args[]) {
        int arr[][] = { { 0, 1 }, { 1, 0 } };
        System.out.println(canFinish(2, arr) ? "True" : "False");
    }
}
