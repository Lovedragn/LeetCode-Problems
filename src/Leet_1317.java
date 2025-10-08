public class Leet_1317 {
    public static int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int temp = n - i;
            boolean s = check(temp);
            boolean t = check(i);
            if (s && t) {
                return new int[] { temp, i };
            }
        }
        return new int[] { 2, 0 };
    }

    public static boolean check(int n) {
        String s = String.valueOf(n);
        if (s.contains("0")) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int res[] = getNoZeroIntegers(4102);

        for (int i : res) {
            System.out.println(i);
        }
    }
}