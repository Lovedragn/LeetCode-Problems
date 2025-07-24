public class Leet_Q1 {
    // contest 459
    public static boolean checkDivisibility(int nn) {
        if(nn < 10)
        {
            return false;
        }
        int n = nn;
        int sum = 0;
        int multiple = 1;
        while (n > 0) {
            int temn = n;//99
            temn %= 10;//9
            sum += temn;
            multiple *= temn;
            n= n/10;
        }
        System.out.println(((sum + multiple)));
       
        return (nn%(sum + multiple)) == 0 || (sum + multiple) == 1;
    }

    public static void main(String args[]) {
        int n = 20;
        System.out.println(checkDivisibility(n) ? "true" : "false");
    }
}
