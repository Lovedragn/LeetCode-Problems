
public class Leet_1550 {

    public static boolean threeConsecutiveOdds(int[] arr) {
        int l=0;
        while (l <= arr.length-3) { 
            int r=l+3;
            int count =0;
            for (int i = l; i < r; i++) {
                if(arr[i]%2 == 0){
                    l = i+1;
                    break;
                }else{
                    count++;
                }if(count == 3){
                    return true;
                }
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(threeConsecutiveOdds(arr) ? "true" : "false");
    }

}
