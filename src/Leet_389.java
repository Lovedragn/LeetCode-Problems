public class Leet_389 {
    public static char findTheDifference(String s, String t) {

        char res = 0;

        for (char c : s.toCharArray()) {
            
            res ^= c;
            
        }

        for (char c : t.toCharArray()) {
            res ^= c;
            System.out.println(res);
        }

        return res;
    }

    public static void main(String args[]) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));

    }
}
