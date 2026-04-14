import java.util.HashMap;

public class Leet_1320 {
    public static int res = 0;
    public static HashMap<Character, int[]> map;

    public static int minimumDistance(String word) {
        int res = 0;
        map = new HashMap<>();
        byte ii = 65;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6 && ii < 91; j++) {
                map.put((char) ii++, new int[] { i, j });
            }
        }

        // recursion
        recursion(word, 1, 0, -1);

        return res;
    }
       static int dist(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }


    public static int recursion(String word, int idx, int f1, int f2) {
        if (idx == word.length()) {
            return 0;
        }

        int current = word.charAt(idx) - 'A';

        int left = dist(map.get((char) (f1 + 'A')), null);
        return Math.min(left , right);
    }

    public static void main(String args[]) {
        System.out.println(minimumDistance("CAKE"));

    }
}
