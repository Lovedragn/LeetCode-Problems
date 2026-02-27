public class Leet_868 {
    public static int binaryGap(int n) {
        int res =0;
        int l=-1;
        int r =0;
        int idx =0;

        while(n != 0){
            int last = (n & 1);
            if(last == 1){
                r = idx;
                if((l != 0 || r != 0) && l != -1){
                    res = Math.max(res, r -l);
                }
                l = r;
            } 
            n = n >> 1;
            idx++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }
}//0101
