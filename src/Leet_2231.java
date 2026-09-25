import java.util.*;

public class Leet_2231 {
    public static int largestInteger(int num) {
        PriorityQueue<Integer> evenQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> oddQueue = new PriorityQueue<>(Collections.reverseOrder());

        String strNum = String.valueOf(num);
        for (char c : strNum.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                evenQueue.offer(digit);
            } else {
                oddQueue.offer(digit);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : strNum.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                result.append(evenQueue.poll());
            } else {
                result.append(oddQueue.poll());
            }
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.println(largestInteger(1234)); // Correct output: 3412
    }
}