public class Leet_274 {

    public static int hIndex(int[] citations) {
        int result = 0;
        int count = 0;
        int value = 0;

        if (citations.length == 0) {
            return 0;
        }
        if (citations.length == 1) {
            return citations[0] == 0 ? 0 : 1;
        }

        for (int i = 0; i < citations.length; i++) {
            value = citations[i];
            for (int j = 0; j < citations.length; j++) {
                if (value != 0 && value <= citations[j]) {
                    count++;
                }
            }
            if (count >= value) {
                result = Math.max(value, result);
            }
            count = 0; // Reset count for the next value
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 2};
        System.out.println(hIndex(nums)); // Expected output should be 1
    }
}
