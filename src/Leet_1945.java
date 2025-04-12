
public class Leet_1945 {

    public static int getLucky(String s, int k) {
      
        StringBuilder temp =new StringBuilder();
        int res = 0;
        for (char c : s.toCharArray()) {
            temp.append(c - 'a' + 1);
        }

        s = temp.toString();
        for (int i = 0; i < k; i++) {
            int sum=0;
            for (char elem : s.toCharArray()) {
                sum += elem -'0';
            }
            s = String.valueOf(sum);
        }
        
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(getLucky(s, k)); // Output: 6
    }
}
