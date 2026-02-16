import java.util.HashSet;

public class Leet_804 {
    public static int uniqueMorseRepresentations(String[] words) {
      
        String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

        HashSet<String> set  = new HashSet<>();
        for (String str : words) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c= str.charAt(i);
                int idx = c - 'a';
                temp.append(code[idx]);
                
            }
            if(!set.contains(temp.toString())){
                set.add(temp.toString());
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        String arr[] = { "gin", "zen", "gig", "msg" };
        System.out.println(uniqueMorseRepresentations(arr));
    }
}
