
public class Leet_2011 {

    public static int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String elem : operations) {
            char front = elem.charAt(1);


            if (front == '-') {
                res--;
            }else{
                res++;
            }


        }
        return res;
    }

    public static void main(String[] args) {
        String arr[] = {"X++", "X--", "++X", "++X"};//0
        System.out.println(finalValueAfterOperations(arr));
    }
}
