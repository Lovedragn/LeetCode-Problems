public class Leet_3861 {
    public static int minimumIndex(int[] capacity, int itemSize) {
        int idx = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;//-2

        for (int i = 0; i < capacity.length; i++) {
            int value = capacity[i] - itemSize;
            if (value < max && value >= 0) {
                idx = i;
                max = value;
            }
        }
        return idx == Integer.MAX_VALUE ? -1 : idx ;
    }

    public static void main(String arga[]) {
        int arr[] = { 1, 5, 3, 7 };
        System.out.println(minimumIndex(arr, 3));
    }
}
