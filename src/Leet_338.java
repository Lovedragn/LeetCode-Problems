public class Leet_338 {
    public static int[] countBits(int n) {
        int res[] = new int[n+1];
        for (int i = 0; i <= n; i++) {
            Integer s = Integer.bitCount(i);
                    res[i] = s;
        }

        return res;
    }

    public static void main(String args[]) {
        int [] res = countBits(5);
        for (int i : res) {
            
            System.out.println(i);
        }

    }
}