public class Leet_2243 {
    public static String digitSum(String s, int k) {
        StringBuilder str = new StringBuilder();
        int l = 0;
        int r = k;

        while ( s.length() > k) {
            int count = 0;
            if (r >= s.length() ) {
                for (int i = l; i < s.length(); i++) {
                    count += Character.getNumericValue(s.charAt(i));
                }
                str.append(count);

                l = 0;
                r = k;
                s = str.toString();
                str.setLength(0);
                continue;
            }
            for (int i = l; i < r; i++) {
                count += Character.getNumericValue(s.charAt(i));
            }
            l = r;
            r += k;
            str.append(count);
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
    }
}
