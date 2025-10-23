public class Leet_3461 {
    public static boolean hasSameDigits(String s) {
        StringBuilder ss = new StringBuilder(s);

        while (ss.length() > 2) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < ss.length() - 1; i++) {
                int a = ss.charAt(i) - '0';
                int b = ss.charAt(i + 1) - '0';
                int total = (a + b) % 10;
                temp.append((char) ('0' + total));
            }
            ss = temp;
        }

        return ss.charAt(0) == ss.charAt(1);
    }

    public static void main(String args[]) {
        boolean res = hasSameDigits("3902");
        System.out.println(res ? "True" : "False");
    }
}