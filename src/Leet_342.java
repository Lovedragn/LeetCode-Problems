public class Leet_342 {
    public static boolean isPowerOfFour(int n) {

        return helper(n, 0);
    }

    public static boolean helper(double n, double index) {
        double calc = Math.pow( 4, index);
        if(n == calc){
            return true;
        }
        if (calc > n) {
            return false;
        }
        
        return helper(n, index + 1);
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfFour(16) ? "true" : "false");
    }
}
