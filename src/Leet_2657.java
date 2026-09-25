

public class Leet_2657 {

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int res[] = new int[A.length];
        int count = 0;
        int arr1[] = new int[A.length+1];
        
        for (int i = 0; i < A.length; i++) {
            if (++arr1[A[i]] == 2) { count++; }
            if (++arr1[B[i]] == 2) { count++; }
            
            res[i] = count;
        }

        return res;
    }

    public static void main(String args[]) {
        int[] a = {2,3,1};
        int[] b = {3,1,2};
        int res[] = findThePrefixCommonArray(a, b);
        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }
}
