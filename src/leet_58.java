
public class leet_58 {

    public static int lengthOfLastWord(String s) {
        int result = 0;
        int r = s.length() - 1;
       
        while ( r  >=0 && s.charAt(r) == ' '  ) {
            r--;
        }
        while ( r >= 0 && s.charAt(r) != ' ' ) {
            result++;
            r--;
        }   

        return result;
    }

    public static void main(String[] args) {
        String str = "day";
        System.out.println(lengthOfLastWord(str));
    }
}
