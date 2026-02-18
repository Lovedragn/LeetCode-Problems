public class Leet_693 {
    public boolean hasAlternatingBits(int n) {
        boolean is = (n & 1) == 1 ? true : false;
        while(n != 0){
            int last = (n & 1);
            if((last == 1 & is == true) || (last == 0 & is == false) ){
                is = !is;

            }else{
                return false;
            }
            n = n >> 1;
        }
        return true;
    }
}
