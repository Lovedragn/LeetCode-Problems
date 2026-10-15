public class Leet_3723 {

    public static String maxSumOfSquares(int num, int sum) {
        if (sum < 1 || (long) num * 9 < sum) {
            return "";
        }

        char[] result = new char[num];
        int index = 0;

        while (sum >= 9) {
            result[index++] = '9';
            sum -= 9;
        }

        if (sum > 0 && index < num) {
            result[index++] = (char) ('0' + sum);
            sum = 0;
        }
        // 9 9

        while (index < num) {
            result[index++] = '0';
        }

        if (sum > 0) {
            return "";
        }

        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(maxSumOfSquares(2, 3));
    }
}
