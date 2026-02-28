import java.math.BigInteger;

public class Leet_1680 {
    public static int concatenatedBinary(int n) {
        final int MOD = 1000000007;
        long result = 0;
        int length = 0;

        for (int i = 1; i <= n; i++) {
            // Increase length when i is a power of 2
            if ((i & (i - 1)) == 0) {
                length++;
            }
            // Shift result left by length bits and add i
            result = ((result << length) % MOD + i) % MOD;
        }

        return (int) result;
    }

    public static void main(String args[]) {
        System.out.println(concatenatedBinary(42));

    }
}
