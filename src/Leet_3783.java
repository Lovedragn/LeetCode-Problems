public class Leet_3783 {
    public static int mirrorDistance(int n) {
        int res = n;
        int reverse = 0;

        while (n != 0) {
            int last = n % 10;
            reverse *= 10;
            reverse += last;
            n /= 10;
        }

        return Math.abs(res - reverse);
    }

    public static void main(String[] args) {
        System.out.println(mirrorDistance(25));
    }
}