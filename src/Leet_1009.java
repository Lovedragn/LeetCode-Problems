public class Leet_1009 {
    public static int bitwiseComplement(int n) {
        if (n == 0) return 1;  // special case
        int mask = 1;
        while (mask <= n) {
            mask = mask << 1;
        }
        return (mask - 1) ^ n;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(10)); // Output: 5
    }
}