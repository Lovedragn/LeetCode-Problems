
public class Leet_1974 {

    public static int minTimeToType(String word) {
        int res = 0;
        char pointer = 'a';
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i); 
            int diff = Math.abs(c - pointer);
            res +=Math.min(diff,26-diff);
            pointer = c;
        }


        return res+word.length();
    }

    public static void main(String[] args) {
        String str = "abc";//5
        System.out.println(minTimeToType(str));
    }
}
