public class Leet_3963 {
    public static String[] createGrid(int m, int n) {
        String[] res = new String[m];
        StringBuilder str = new StringBuilder();

        for (int j = 0; j < n; j++) {
            str.append(".");
        }
        int idx = 0;
        res[idx++] = str.toString();
        str.delete(0, n + 1);

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                str.append("#");
            }
            str.append(".");
            res[idx++] = str.toString();
            str.delete(0, n + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] res = createGrid(4, 5);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
