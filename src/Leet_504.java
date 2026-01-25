public class Leet_504 {
    public static String convertToBase7(int num) {
        if (num == 0) return "0";  // handle zero case

        boolean isNegative = num < 0;
        num = Math.abs(num);

        StringBuilder str = new StringBuilder();

        while (num > 0) {
            int remainder = num % 7;
            str.append(remainder);
            num /= 7;
        }

        str.reverse();  // reverse digits

        if (isNegative) {
            str.insert(0, "-");  // prepend sign
        }

        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }
}