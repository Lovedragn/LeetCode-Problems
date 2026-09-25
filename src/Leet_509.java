public class Leet_509 {
     public static int fib(int n) {
        if(n < 1){
            return n==0 ? 0 : n-1;
        }
      

        return recursion(n);
    }
    public static int recursion(int n){
        if(n <= 1){
            return n;
        }
        return recursion(n-1) + recursion(n-2);
    }
    public static void main(String args[]){
        int n=1;
        System.out.println(fib(n));
    }
}
