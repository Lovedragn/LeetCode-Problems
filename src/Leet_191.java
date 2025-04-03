public class Leet_191 {
    public static int hammingWeight(int n) {
        int c = n | 1;
        
        return c;
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(hammingWeight(n));
    }
}
