public class Leet_1689 {
 
    public static int minPartitions(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); ++i) {
            ans = Math.max(ans, n.charAt(i) - '0');
        }
        return ans;
    
}

    public static void main(String args[]) {
        System.out.println(minPartitions("82734"));
    }
}
