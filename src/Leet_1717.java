import java.util.*;

public class Leet_1717 {
    public static int maximumGain(String s, int x, int y) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }

        int maxGain = 0;
        char first = x > y ? 'a' : 'b';
        char second = x > y ? 'b' : 'a';
        int big = Math.max(x, y);
        int small = Math.min(x, y);

        Stack<Character> stack1 = new Stack<>();
        for (char c : list) {
            if (c == second && !stack1.isEmpty() && stack1.peek() == first) {
                stack1.pop();
                maxGain += big;
            } else {
                stack1.push(c);
            }
        }

        Stack<Character> stack2 = new Stack<>();
        while (!stack1.isEmpty()) {
            char c = stack1.pop();
            if (c == second && !stack2.isEmpty() && stack2.peek() == first) {
                stack2.pop();
                maxGain += small;
            } else {
                stack2.push(c);
            }
        }

        return maxGain;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        int result = maximumGain(s, x, y);
        System.out.println("Maximum Gain: " + result);
    }
}
