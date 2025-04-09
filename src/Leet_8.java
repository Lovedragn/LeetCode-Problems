
public class Leet_8 {

    public static int myAtoi(String s) {

        StringBuilder str = new StringBuilder();
        int l = 0;
        s = s.trim();
       
        if ( s.length()==0|| (s.length() <= 1 && !Character.isDigit(s.charAt(l)))|| (!Character.isDigit(s.charAt(l)) && s.charAt(l) != '-' && s.charAt(l) != '+')) {
            return 0;
        }
        while (l < s.length()) {
            char c = s.charAt(l);
            if (l == 0 && (c == '-' || c == '+')) {
                str.append(c);
                l++;
                continue;
            }

            if (Character.isDigit(c)) {
                str.append(c);
                long ll = Long.parseLong(str.toString());
                if (ll > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (ll < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

            } else {
                try {
                    int cc = Integer.parseInt(str.toString());
                } catch (Exception e) {
                      return 0;  
                }
                break;
            }
            l++;
        }
        return Integer.parseInt(str.toString());
    }

    public static void main(String args[]) {
        String st = "";
        System.out.println(myAtoi(st));//3ms solution, nerfed edge case😭

    }
}
