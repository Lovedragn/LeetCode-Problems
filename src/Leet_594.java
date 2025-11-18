import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Leet_594 {

    public static int findLHS(int[] nums) {
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> i : map.entrySet()) {
            if(map.containsKey(i.getKey()+1)){
                int count = i.getValue() + map.get(i.getKey()+1);
                res = Math.max(count , res); 
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 2, 5, 2, 3, 7 };
        System.out.println(findLHS(arr));
    }
}
