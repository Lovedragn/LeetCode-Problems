import java.util.Arrays;
import java.util.HashMap;

public class Leet_846 {
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false; // quick check
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(hand);
        
        // Build frequency map
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        // Try to form groups
        for (int card : hand) {
            if (map.get(card) == 0) continue; // already used
            
            for (int j = 0; j < groupSize; j++) {
                int nextCard = card + j;
                if (map.getOrDefault(nextCard, 0) == 0) {
                    return false; // group cannot be formed
                }
                map.put(nextCard, map.get(nextCard) - 1);
            }
        }
        
        return true;
    }
}
