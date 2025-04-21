
public class Leet_2145 {

    public static int numberOfArrays(int[] differences, int lower, int upper) {
        int res = 0;
        int min = 0;
        int max = 0;
        for (int elem : differences) {
            res += elem;//1 -2 2
            min = Math.min(res, min);//0 -2 -2
            max = Math.max(res, max);//1 1 2
        }
        return (upper - lower - max + min + 1); //6-1 - 2-2+1
    }

    public static void main(String args[]) {
        int arr[] = {1, -3, 4};
        System.out.println(numberOfArrays(arr, 1, 6));
    }
}
