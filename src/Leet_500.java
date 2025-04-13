import java.util.*;

public class Leet_500 {
    public static String[] findWords(String[] words) {
        HashMap<Integer, List<Character>> map = new HashMap<>();

        map.put(1, new ArrayList<Character>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')));
        map.put(2, new ArrayList<Character>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')));
        map.put(3, new ArrayList<Character>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm')));
        List<String> list = new ArrayList<>();
        
        for (String elems : words) {
            
            String elem = elems;
            elem = elem.toLowerCase();
            for (int i = 1; i <= 3; i++) {
                for (int k=0;k<elem.length();k++) {
                    if(map.get(i).contains(elem.charAt(k))){
                        if(k == elem.length()-1){
                            list.add(elems);
                        }  
                    }
                    else{
                        break;
                    }
                }
            }
        }
        String res[] = new String[list.size()];
        for(int i=0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String words[] = { "Hello", "Alaska", "Dad", "Peace" };
        String res[] = findWords(words);
        for(String elem : res){

            System.out.println(elem);
        }
    }
}
