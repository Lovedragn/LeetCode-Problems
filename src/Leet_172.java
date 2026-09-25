
public class Leet_172 {

    public static int trailingZeroes(int n) {
        int res = 0;

        while (n > 0) { 
            n = n/5;
            res+=n;
        }
        return res;
    }


    public static void main(String[] args) {
        int n = 30;
        System.err.println(trailingZeroes(n));
    }
}
