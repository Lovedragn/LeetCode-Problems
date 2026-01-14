public class Leet_1769 {
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];

        // Left to right pass
        int balls = 0, moves = 0;
        for (int i = 0; i < n; i++) {
            result[i] += moves;
            if (boxes.charAt(i) == '1') {
                balls++;
            } 
            moves += balls;
        }
        
        // Right to left pass
        balls = 0;
        moves = 0;
        for (int i = n - 1; i >= 0; i--) {
            result[i] += moves;
            if (boxes.charAt(i) == '1') {
                balls++;
            }if(i == 4){
            }
            moves += balls;
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "001011"; // Expected: [11,8,5,4,3,4]
        int[] ans = minOperations(str);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}