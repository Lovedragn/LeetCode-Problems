public class Leet_258 {
    public static int addDigits(int num) {
        
        int res =0;

        while(num >= 10){
            int temp = num;
            while(temp != 0){
                int last = temp%10;
                temp /=10;
                res += last; 
            }
            num = res;
            res =0;
            
        }
        return num;
    }

    public static void main(String args[]) {
        System.out.println(addDigits(10));
    }
}
