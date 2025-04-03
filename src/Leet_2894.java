
public class Leet_2894 {

    public static int differenceOfSums(int n, int m) {
        int nn = 0;
        int mm = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                mm += i;
            } else {
                nn += i;
            }
        }
        return (nn-mm);
    }

    public static void main(String[] args) {
        System.out.println(differenceOfSums(10, 3));
    }
}
