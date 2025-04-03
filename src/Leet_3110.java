
public class Leet_3110 {

    public static int scoreOfString(String s) {
        int res = 0;

        for (int i = 0; i < s.length()-1; i++) {
            int start = 97 + (s.charAt(i)-'a');
            int end = 97+(s.charAt(i+1)-'a');
            res += Math.abs(start - end);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }
}