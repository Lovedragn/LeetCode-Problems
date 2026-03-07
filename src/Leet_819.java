import java.util.HashMap;
import java.util.Map;

public class Leet_819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String low = paragraph.toLowerCase();
        String[] words = low.split("[^a-z]+");
        String res = "";
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {

            if (word.isEmpty()) continue; 
            
            boolean isBanned = false;
            for (String bannedWord : banned) {
                if (word.equals(bannedWord)) {
                    isBanned = true;
                    break;
                }
            }
            
            if (!isBanned) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                res = entry.getKey();
            }
        }

        return res;
    }
}
