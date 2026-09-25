
import java.util.*;

public class Leet_231 {
    public static boolean isPowerOfTwo(int n) {
        boolean res = recursion(n, 0);
        return res;
    }

    public static boolean recursion(int n, int top) {
        if(Math.pow(2,top) == n){
            return true;
        }
        if (Math.pow(2, top) > n) {

            return false;
        }

        
        return recursion(n, top + 1);
    }

    // 4
    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(19) ? " true" : " false");
    }
}
