public class Leet_806 {

    public static int[] numberOfLines(int[] widths, String s) {
        int count = 1;
        int total = 0;

        for (char c : s.toCharArray()) {
            int idx = c - 'a';

            if (total + widths[idx] > 100) {
                count++;
                total = 0;
            }
            total += widths[idx];

        }
        int[] res = new int[2];
        res[0] = count;
        res[1] = total;
        System.out.println(res[0] + " " + res[1]);
        return res;
    }

    public static void main(String[] args) {
        int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10 };

        String s = "bbbcccdddaaa";
        System.out.println(numberOfLines(widths, s));
    }
}
