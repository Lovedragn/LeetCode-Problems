public class Leet_415 {
    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int mins = Math.min(j, i);

        while (i >= 0 || j >= 0 || carry != 0) {
            char cnum1 = '0';
            char cnum2 = '0';
            if (i >= 0) {
                cnum1 = num1.charAt(i);
            }
            if (j >= 0) {
                cnum2 = num2.charAt(j);
            }

            // converter
            int total = Integer.parseInt(Character.toString(cnum1)) + Integer.parseInt(Character.toString(cnum2))
                    + carry;

            int temp = total % 10;
            res.append(temp);
            carry = total/10;
            i--;
            j--;
        }
        return res.reverse().toString();
    }

    public static void main(String args[]) {
        System.out.println(addStrings("457", "77"));// 134
    }
}
