import java.util.*;
public class Leet_455 {

    public static int findContentChildren(int[] g, int[] s) {

        // cookes >= babies

        int up = 0;
        int down = 0;

        Arrays.sort(g);
        Arrays.sort(s);
        while (up < g.length && down < s.length) {
            if (s[down] >= g[up]) {
                up++;down++;
            } else {
                down++;
            }
        }
        return up;
    }

    public static void main(String[] args) {
        int babies[] = {10, 9, 8, 7};
        int cookies[] = {5, 6, 7, 8};
        System.out.println("Baby : " + findContentChildren(babies, cookies));
    }
}
