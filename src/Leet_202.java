
public class Leet_202 {

    public static boolean isHappy(int n) {
        int a, sum = 0;
        if (n == 1 || n == 7) {
            return true;
        } else if (n < 10) {
            return false;
        } else {

            while (n > 0) {

                a = (n % 10);//9
                n /= 10;
                sum += a * a;
            }
            return isHappy(sum);
        }
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
