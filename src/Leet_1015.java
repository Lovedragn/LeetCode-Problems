public class Leet_1015 {
    public static int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0)
            return -1;
        int j = 0;
        int i = 1;
        while (j <= k) {
            int smallestrep = (j * 10 + 1) % k;
            if (smallestrep == 0) {
                return i;
            } else {
                j = smallestrep;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(smallestRepunitDivByK(7));
    }
}
