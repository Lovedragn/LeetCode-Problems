public class Leet_1791 {
    public static int findCenter(int[][] edges) {
        int arr[] = new int[edges.length +2];

        for (int i = 0; i < edges.length; i++) {
            arr[edges[i][0]]++;
            arr[edges[i][1]]++;
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == edges.length) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2 }, { 2, 3 }, { 4, 2 } };
        System.out.println(findCenter(arr));
    }
}
