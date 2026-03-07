import java.util.PriorityQueue;

public class Leet_821 {
    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        PriorityQueue<Integer> index = new PriorityQueue<>();

        for (int i=0;i<s.length();i++) {
            if(s.charAt(i) == c){
                index.offer(i);
            }
        }

        int prev = -1;
        for (int i = 0; i < res.length; i++) {
            if(!index.isEmpty() && i == index.peek()){
                prev = index.poll();
            } 
            if(prev == -1){
                res[i] = Math.abs(i - index.peek());        
            }else if(index.isEmpty()){
                res[i] = Math.abs(prev - i);
            }else{
                res[i] = Math.min(Math.abs(prev- i), Math.abs(i-index.peek())) ;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int[] res = shortestToChar("aaba", 'b');
        for (int i : res) {

            System.out.println(i);
        }
    }
}
