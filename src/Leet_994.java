import java.util.*;

public class Leet_994 {
     public static int orangesRotting(int[][] grid) {
        int res = 0;
        Queue<int[]> q = new LinkedList<>();
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 2){
                    visited[i][j] = 2;
                    q.add(new int[]{i ,j ,res});
                }
            }
        }
        res = population(visited , grid , q , res);
        return res;
    }
    public static int population(int[][] visited , int[][] grid,Queue<int[]>q , int res){
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        while(!q.isEmpty()){ 
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            res = curr[2];
            
            for(int i = 0 ; i < 4 ; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];
                
                if(newX >= 0 && newY >= 0 && newX < grid.length && newY < grid[0].length && 
                   visited[newX][newY] == 0 && grid[newX][newY] == 1){
                    visited[newX][newY] = 2;
                    q.add(new int[]{newX, newY, res + 1});
                }
            }
        }
        
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1 && visited[i][j] != 2){
                    return -1; // Not all oranges can rot
                }
            }
        }
        
        return res;
    }

  
    public static void main(String args[]){
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        int result = orangesRotting(grid);
        System.out.println("Minimum time to rot all oranges: " + result);
    }
}
