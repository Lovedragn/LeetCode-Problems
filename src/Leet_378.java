import java.util.PriorityQueue;

public class Leet_378 {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all elements to the heap
        for (int[] row : matrix) {
            for (int num : row) {
                minHeap.add(num);
            }
        }

        // Remove k elements, the last removed is our answer
        while (k-- > 1) {
            minHeap.poll();
        }

        return minHeap.poll(); // k-th smallest element
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        System.out.println(kthSmallest(matrix, k)); // Output: 13
    }
}