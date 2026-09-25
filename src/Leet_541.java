import java.util.Arrays;

public class Leet_541 {
    public static String reverseStr(String s, int k) {
     
        char[] ss = s.toCharArray();

       for(int i=0 ; i<ss.length;i+=(2*k)){
            int l = i;
            int r = Math.min((i+k-1) , ss.length-1);

            while (l < r) {
                char temp = ss[l];
                ss[l] = ss[r];
                ss[r] = temp;
                l++;
                r--;
            }
         
        }

        return new String(ss);
    }

    public static void main(String args[]) {
        String s = "ab10cd10ef";
        System.out.println(reverseStr(s, 2));

    }
}
