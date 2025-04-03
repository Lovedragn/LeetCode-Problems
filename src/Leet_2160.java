
import java.util.Arrays;

public class Leet_2160 {

    public static int minimumSum(int num) {
        int res = 0;

        int r = 2;

        char str[] = String.valueOf(num).toCharArray();
        Arrays.sort(str);

        for (int l = 0; l < 2; l++) {
            res += (Integer.parseInt(String.valueOf(str[l])) *10) + Integer.parseInt(String.valueOf(str[r]));
            r++;
            
        }

        return res;
    }

    public static void main(String[] args) {
        int num = 2932;
        System.out.println(minimumSum(num));
    }
}
