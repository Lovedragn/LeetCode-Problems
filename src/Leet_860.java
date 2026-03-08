import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Leet_860 {
    public static boolean lemonadeChange(int[] bills) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        
        for (int i = 0; i < bills.length; i++) {
            int val = bills[i];
            map.put(val, map.getOrDefault(val, 0) + 1);
            if (val != 5) {
                int remaining = val - 5;
                if (map.isEmpty()) {
                    return false;
                }
                for (Map.Entry<Integer, Integer> set : map.entrySet()) {
                    int key = set.getKey();
                    if (key <= remaining) {
                        while (remaining >= key && map.get(key) > 0) {
                            if (map.get(key) == 0) {
                                break;
                            }
                            map.put(key, map.get(key) - 1);
                            remaining = remaining - key;
                        }
                    }
                }
                if(remaining != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int bills[] = { 5, 5, 5, 10, 30 };
        System.out.println(lemonadeChange(bills));
    }
}
