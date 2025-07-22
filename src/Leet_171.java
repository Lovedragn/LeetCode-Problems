public class Leet_171 {
    public static int titleToNumber(String columnTitle) {
        int res = 0;
        
        for (char c : columnTitle.toCharArray()) {
            res = res * 26 + (Integer.parseInt(Integer.toString(c))-64);
        }
        return res;
    }

    public static void main(String args[]) {
        String str = "AA";
        System.out.println(titleToNumber(str));
    }
}
