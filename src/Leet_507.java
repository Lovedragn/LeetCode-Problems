public class Leet_507 {
    public static boolean checkPerfectNumber(int num) {
    if (num <= 1) return false;  // no perfect numbers <= 1

    int sum = 0;
    // Only go up to num/2 because no divisor (except num itself) is greater than num/2
    for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }

    return sum == num;
}

    public static void main(String args[]) {
        System.out.println(checkPerfectNumber(28) ? "T" : "F");
    }
}
