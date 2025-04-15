
public class Leet_12 {

        public static String intToRoman(int num) {
            StringBuilder res = new StringBuilder();
            int arr[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                while (num >= arr[i]) {
                    num -= arr[i];
                    count++;
                }
                res.append(roman[i].repeat(count));
                if (num == 0) {
                    break;
                }
            }
            return res.toString();
        }

    public static void main(String args[]) {
        int num = 3749;
        System.out.print(intToRoman(num));
    }
}
