


public class Leet_2000 {

    public static String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder();
        boolean trigger = false;
        if (!word.contains(String.valueOf(ch))) {
            return word;
        }
        for (int i = 0; i < word.length(); i++) {
            char s = word.charAt(i);
            
            if (trigger) {
                res.append(s);
            }
            else if (ch == s) {
                    trigger = true;   
                    res.insert(0, s);   
            }
            else{
                res.insert(0, s);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abcd";
        char target = 'z';
        System.out.println(reversePrefix(s, target));
    }
}
