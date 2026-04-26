public class Leet_2833 {
    public static int furthestDistanceFromOrigin(String moves) {
        int R = 0;
        int L = 0;
        int F = 0;

        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    L++;
                    break;
                case 'L':
                    R++;
                    break;
                case '_':
                    F++;
                    break;
            }
        }
        System.out.println(L+" "+R+" "+F);
        if (L == R) {
            return F;

        } else if (L < R) {
            return R - L + F;
        }
        return L - R + F;
    }

    public static void main(String[] args) {
        String str = "L_RL__R";
        System.out.println(furthestDistanceFromOrigin(str));
    }
}
