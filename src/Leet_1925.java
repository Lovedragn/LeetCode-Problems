public class Leet_1925 {
    public static int countTriples(int n) {
        int res = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int cal = a * a + b * b;
                int c = (int) Math.sqrt(cal);

                // Check if cal is a perfect square and within bounds
                if (c * c == cal && c <= n) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countTriples(n)); // Expected output: 2
    }
} 