public class Leet_796 {
    public static boolean rotateString(String s, String goal) {
        int current = 0;
        if(s.length() != goal.length()){
            return false;
        }
        
        while (current < s.length()) {
            int count =0;
            int temp = current;
            for (int i = 0; i < s.length(); i++) {
                temp = (i + current) % s.length();
                if (s.charAt(temp) != goal.charAt(i)) {
                    break;
                }
                count++;
            }
            if(count == s.length()){
                return true;
            }
            current++;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(rotateString(str, "cdeab"));
    }
}
