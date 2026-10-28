import java.util.HashSet;

public class Leet_3882 {
    public static int minCost(int[][] grid) {
        HashSet<Integer>[][] visited = new HashSet[grid.length][grid[0].length];

        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                visited[i][j] = new HashSet<>();
            }
        }
        
        visited[0][0].add(grid[0][0]);
        
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                int val = grid[i][j];
                if(i > 0){
                    for (int  prevxor : visited[i-1][j]) {
                        visited[i][j].add(prevxor ^ val);
                    }
                }
                
                if(j > 0){
                    for (int  prevxor : visited[i][j-1]) {
                        visited[i][j].add(prevxor ^ val);
                    }
                }
            }
        }

        int count =Integer.MAX_VALUE;
        for (int i : visited[visited.length-1][visited[0].length-1]) {
            count = Math.min(i, count); 
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3, 4 } };
        System.out.println(minCost(arr));
    }
}