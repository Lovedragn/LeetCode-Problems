import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Leet_2264 {
    public static String largestGoodInteger(String num) {
        PriorityQueue<String> list = new PriorityQueue<>(Collections.reverseOrder());
        int l=0;
        while(l < num.length()-2){
            for (int i = l; i < l+3; i++) {
                if(num.charAt(i) != num.charAt(l)){
                    break;
                }
                if(i == l+2){
                    list.offer(num.substring(l, l+3));
                }    
            }
            l++;

        }  
        return list.isEmpty()? "" : String.valueOf(list.poll());
    }

    public static void main(String[] args) {
        String num = "2300019";
        String result = largestGoodInteger(num);
        System.out.println("Largest good integer: " + result);
    }
}