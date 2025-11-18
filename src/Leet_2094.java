import java.util.Arrays;
import java.util.HashSet;

public class Leet_2094 {
    public static HashSet<Integer> set;

    public static int[] findEvenNumbers(int[] digits) {
        set = new HashSet<>();

        boolean[] visited = new boolean[digits.length];
        recursion(digits, visited, new StringBuilder());

        int res[] = new int[set.size()];

        int i = 0;
        for (int j : set) {
            res[i] = j;
            i++;
        }
        Arrays.sort(res);
        return res;
    }

    public static void recursion(int[] digits, boolean visited[], StringBuilder str) {
        if (str.length() == 3) {
            int value=Integer.parseInt(str.toString());
            if(value%2 ==0 && str.charAt(0) != '0'){
                set.add(value);
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            str.append(digits[i]);
            recursion(digits, visited, str);
            str.deleteCharAt(str.length()-1);
            visited[i] = false;
        }
    }

    public static void main(String args[]) {
        int digits[] = { 2, 1, 3, 0 };

        int res[] = findEvenNumbers(digits);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
