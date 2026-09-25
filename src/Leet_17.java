import java.util.*;

public class Leet_17 {

    public static HashMap<Character, List<Character>> clones = new HashMap<>();

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }
        clones.put('2', Arrays.asList('a','b','c'));
        clones.put('3', Arrays.asList('d','e','f'));
        clones.put('4', Arrays.asList('g','h','i'));
        clones.put('5', Arrays.asList('j','k','l'));
        clones.put('6', Arrays.asList('m','n','o'));
        clones.put('7', Arrays.asList('p','q','r','s'));
        clones.put('8', Arrays.asList('t','u','v'));
        clones.put('9', Arrays.asList('w','x','y','z'));

        helper(res , digits ,0 ,new StringBuilder());
        return res;
    }

    public static void helper(List<String> res , String digits ,int index  , StringBuilder str){
        if(digits.length() == str.length()){
            res.add(str.toString());
            return;
        }
        List<Character> temp = clones.get(digits.charAt(index));
        for (int i = 0; i < temp.size(); i++) {
            str.append(temp.get(i));
            helper(res, digits, index+1, str);
            str.deleteCharAt(str.length()-1);
        }
    }

    public static void main(String args[]) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
