public class Leet_344 {
    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String args[]) {
        char[] s = { 'h', 'e', 'l','g', 'l', 'o' };
        reverseString(s);

        for (char c : s) {

            System.out.println(c);
        }
    }
}
