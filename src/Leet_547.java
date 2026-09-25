import java.util.*;

public class Leet_547 {
    public static List<List<Integer>> list;

    public static int findCircleNum(int[][] isConnected) {
        list = new ArrayList<>();
        adjacency(isConnected);
        boolean visited[] = new boolean[isConnected.length];
        int res = 0;

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) {

                dfs(visited, i);
                res++;
            }
        }
        return res;
    }

    public static void dfs(boolean[] visited , int start  ){
        visited[start] = true;
        for (int neighbour : list.get(start)) {
            if(!visited[neighbour]){
                dfs(visited, neighbour);
            }
        }
    }

    public static void adjacency(int[][] isconnected) {
        for (int i = 0; i < isconnected.length; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < isconnected.length; i++) {
            for (int j = 0; j < isconnected[0].length; j++) {
                if (isconnected[i][j] == 1 && i != j) {

                    list.get(i).add(j);
                }
            }
        }

    }

    public static void main(String args[]) {

        int arr[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
        System.out.println(findCircleNum(arr));
    }
}
