
public class Leet_1534 {

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {

                    for (int k = j + 1; k < n; k++) {
                        if ( Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3};
        int a = 0, b = 0, c = 1;
        System.out.println(countGoodTriplets(arr, a, b, c));
    }
}
