public class Leet_3780 {
    public static int countCommas(int n) {
        // 1,000,000
        if (n < 1000) {
            return 0;
        } else if (n < 100000)
            return n - 999;
        return 9000 + ((n - 99999) * 2);
    }

    public static void main(String[] args) {
        System.out.println(countCommas(10068));
    }
}