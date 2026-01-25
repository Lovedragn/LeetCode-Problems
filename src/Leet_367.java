public class Leet_367 {
    public static boolean isPerfectSquare(int num) {
        if (num == 1) return true;

        int l = 1;  
        int r = num;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sq = (long) mid * mid; // prevent overflow

            if (sq == num) {
                return true;
            } else if (sq > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14) ? "T" : "F"); // F
        System.out.println(isPerfectSquare(16) ? "T" : "F"); // T
        System.out.println(isPerfectSquare(1) ? "T" : "F");  // T
    }
}