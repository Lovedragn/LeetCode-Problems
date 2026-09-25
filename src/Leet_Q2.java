public class Leet_Q2 {
    public static String removeDigit(String number, char digit) {
        String maxNum = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                // Remove digit at position i
                String newNum = number.substring(0, i) + number.substring(i + 1);
                
                // Compare strings lexicographically
                if (maxNum.equals("") || newNum.compareTo(maxNum) > 0) {
                    maxNum = newNum;
                }
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(removeDigit("123", '3')); // Output: "12"
    }
}
