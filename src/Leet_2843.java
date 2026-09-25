
public class Leet_2843 {

    public static int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 0) {
                String str = Integer.toString(i);
                int len = 0;
                int left = 0;
                int right = 0;

                while (str.length() / 2 > len) {

                    left += str.charAt(len);
                    right += str.charAt((str.length() / 2) + len);
                    len++;
                }
                if (left == right) {
                    res++;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int low = 1, high = 100;
        System.out.println(countSymmetricIntegers(low, high));
    }

}
