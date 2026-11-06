import java.util.Arrays;

public class Leet_2747 {
    public static int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int[][] sorted_queries = new int[queries.length][2];

        for (int i = 0; i < queries.length; i++) {
            sorted_queries[i][0] = queries[i];
            sorted_queries[i][1] = i;
        }
        Arrays.sort(sorted_queries, (a, b) -> Integer.compare(a[0], b[0]));
        
        int ans[] = new int[queries.length];
        int l =0, r =0 , active =0;
        int count[] = new int[n+1];

        for (int[] i : sorted_queries) {
            int t = i[0];
            int original_query = i[1];

            while(r < logs.length && logs[r][1] <= t){
                if(++count[logs[r++][0]] == 1){
                    active++;
                }
            }
            while(l < r && logs[l][1] < t -x){
                if(--count[logs[l++][0]] == 0){
                    active--;
                }
            }
            ans[original_query] = n - active;
        }

        return ans;
    }

    public static void main(String[] args) {

        int res[] = countServers(3, new int[][] { { 1, 3 }, { 2, 6 }, { 1, 5 } }, 5, new int[] { 10, 11 });
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}