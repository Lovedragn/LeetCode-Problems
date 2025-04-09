
public class Leet_7 {

    public static int reverse(int x) {
        int res = 0;
        int temp;
        if (x > Integer.MAX_VALUE / 10) {
            return 0;
        }
        if (x < Integer.MIN_VALUE / 10) {
            return 0;
        }

        while (x != 0) {
            temp = x % 10;
            res *= 10;
            res += temp;
            x /= 10;
        }

        return res;
    }

    public static void main(String args[]) {
        int num = 1534236469;
        System.out.println(reverse(num)); // Expected output: 321

    }

}
