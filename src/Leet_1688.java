
public class Leet_1688 {

    public static int numberOfMatches(int n) {
        int res = 0;
        int match = n;
        int advances = n;//7

        while ( advances != 1) {
            if (n%2 !=0) {
                advances = ((advances-1)/2)+1;// 4 2                
            }else{
                
            }
            match -= advances;  //3 1 
            res+= match; //3 4 0
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
}
