public class Leet_1899 {
    public static boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] max = new int[target.length];

        for (int[] t : triplets) {
            // Only consider triplets that don't exceed target
            if (t[0] <= target[0] && t[1] <= target[1] && t[2] <= target[2]) {
                for (int j = 0; j < target.length; j++) {
                    max[j] = Math.max(max[j], t[j]);
                }
            }
        }

        // Check if we matched target
        for (int i = 0; i < target.length; i++) {
            if (max[i] != target[i])
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int[][] triplets = { { 2, 5, 3 }, { 1, 8, 4 }, { 1, 7, 5 } };
        int[] target = { 2, 7, 5 };
        System.out.println(mergeTriplets(triplets, target));
    }
}
