import java.util.HashMap;

public class Leet_657 {
    public static boolean judgeCircle(String moves) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('U', 0);
        map.put('R', 0);
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'D') {
                map.put('U', map.get('U')-1);
            }else if( c == 'L'){
                map.put('R', map.get('R')-1);
            }else{
                map.put(c, map.get(c) + 1);
            }
        }
        for (Integer i : map.values()) {
            if(i != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(judgeCircle("UD"));
    }
}