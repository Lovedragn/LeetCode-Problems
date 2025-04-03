
import java.math.BigInteger;

public class Leet_67 {

    public static String addBinary(String a, String b) {
        BigInteger as = new BigInteger(a, 2);
        BigInteger bs = new BigInteger(b, 2);

        BigInteger sum = as.add(bs);

        return sum.toString(2);

    }

    public static void main(String[] args) {
        String a = "00101111001110001111100001101", b = "1101010010111011100011001011101111001100000011011110011";
        System.out.println(addBinary(a, b));
    }
}
