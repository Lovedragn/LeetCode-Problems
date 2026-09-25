
import java.util.*;

class Leet_20{
    
    public static HashMap<Character,Character> map = new HashMap<>();

    public static boolean isValid(String s) {
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        Stack stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));        
            }
            else{
                if (!stack.isEmpty() && stack.peek() == map.get(s.charAt(i))) {
                    stack.pop();
                }
                else{
                        
                }
            }
        }
        
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s = "}";
        System.out.println(isValid(s));
    }
}