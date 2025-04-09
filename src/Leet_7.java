
public class Leet_7 {

    public static int reverse(int x) {
        int res = 0;
        
        while (x != 0) {
            if (res < Integer.MIN_VALUE / 10) return 0;
            if (res> Integer.MAX_VALUE / 10) return 0;
            int temp = x % 10;
            res *= 10;
            res += temp;
            x /= 10;
        }

        return res;
    }

    public static void main(String args[]) {
        int num = -2147483412;
        System.out.println(reverse(num)); // Expected output: 321

    }

}
