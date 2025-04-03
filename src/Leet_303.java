
public class Leet_303 {
public static int[] arr = {-2, 0, 3, -5, 2, -1};
    public static int sumRange(int left, int right) {
        int cal = 0;
        for (int i = left; i <= right; i++) {
            cal += arr[i];
        }
        return cal;
    }

    public static void main(String[] args) {
        
        System.out.println(sumRange(0, 2));

    }
}
