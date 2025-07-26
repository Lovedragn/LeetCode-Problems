import java.util.*;

public class Leet_326 {
    public static boolean isPowerOfThree(int n) {

        return recursion(n, 0);
    }

    public static boolean recursion(int n, int i) {
        if (Math.pow(3,i) == n) {

            return true;
        }
        if (Math.pow(3, i )> n) {

            return false;
        }
        return recursion(n, i + 1);

    }

    public static void main(String args[]) {
        System.out.println(isPowerOfThree(0) ? "true" : "false");
    }

}
