public class Leet_263 {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 5 == 0) {
                n /= 5;
            }else break;
        }

        return (n == 1);
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(isUgly(n) ? "T" : "F");
    }
}
