import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_67 {
    public static String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int carry = 0;

        int cur_a = a.length() - 1;
        int cur_b = b.length() - 1;

        while (cur_a >= 0 || cur_b >= 0) {
            char c1 = (cur_a >= 0) ? a.charAt(cur_a) : '0';
            char c2 = (cur_b >= 0) ? b.charAt(cur_b) : '0';

            if (c1 == c2) { // both same: 00 or 11
                if (c1 == '1') { // case 11
                    if (carry == 1) {
                        str.append('1'); // 1+1+1 = 3 → bit=1, carry=1
                    } else {
                        str.append('0'); // 1+1=2 → bit=0, carry=1
                    }
                    carry = 1;
                } else { // case 00
                    str.append(carry == 1 ? '1' : '0');
                    carry = 0;
                }
            } else { // case 01 or 10
                if (carry == 1) {
                    str.append('0'); // 1+0+1 = 2 → bit=0, carry=1
                    carry = 1;
                } else {
                    str.append('1'); // 1+0=1 → bit=1, carry=0
                    carry = 0;
                }
            }

            cur_a--;
            cur_b--;
        }
  
        if (carry == 1) {
            str.append('1');
        }

        return str.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1")); // Expected output: "100"
    }
}