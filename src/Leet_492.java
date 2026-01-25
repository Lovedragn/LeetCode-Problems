public class Leet_492 {
    public static int[] constructRectangle(int area) {
        int x = (int) Math.sqrt(area);
        // Start from sqrt(area) and go downwards
        for (int i = x; i >= 1; i--) {
            if (area % i == 0) { // found a divisor
                int l = area / i;
                int w = i;
                return new int[] { l, w }; // first valid pair is the answer
            }
        }
        return new int[] { -1, -1 }; // fallback (should never happen)
    }

    public static void main(String[] args) {
        int[] res = constructRectangle(122122);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}