public class Leet_190 {

    public static int reverseBits(int n) {
        int res =0;

        for (int i = 0; i < 32; i++) {
            res = (res << 1) | (n & 1);
            n >>=1;    
        }
        return res;
    }

    public static void main(String args[]) {
        int n = 43261596;
        System.out.println(reverseBits(n));

    }
}
