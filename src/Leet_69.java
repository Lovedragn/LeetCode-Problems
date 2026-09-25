
public class Leet_69 {

    public static int mySqrt(int x) {
        int res = 0;
        int l = 0;
        int r = x;

        if (x <= 1 ) {
            return x;
        }
        while (l <= r) { 
            int mid = l+ (r-l)/2;
            
            long spr = (long) mid*mid;
            if(spr == x ){
                return mid;
            }
            else if(spr < x){
                l = mid+1;
                res = mid;
            }else{
                r = mid-1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 2147395599;
        System.out.println(mySqrt(n));

    }
}
