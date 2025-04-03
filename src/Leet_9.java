public class Leet_9 {

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        return my_fun(s, 0, s.length()-1);
    }

    public static boolean my_fun(String s, int l, int r) {
        if (l<r) {
            return true;
        }
        if (s.charAt(l) == s.charAt(r)) {
            
            return my_fun(s, l+1, r-1);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
}
