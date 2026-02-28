public class Leet_1680 {
    public static int concatenatedBinary(int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String value = Integer.toBinaryString(i);
            str.append(value);

        }
        Long res = ((Long.parseUnsignedLong(str.toString(), 2) % ((int) Math.pow(10, 9)) + 7));
        return Integer.parseInt(res.toString());
    }

    public static void main(String args[]) {
        System.out.println(concatenatedBinary(42));

    }
}
