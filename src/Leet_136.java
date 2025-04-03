
import java.util.*;

public class Leet_136 {

    public static int singleNumber(int[] nums) {
        int res = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int elem : nums) {
            int calc = elem ^ 1;
            if (map.containsKey(calc)) {
                map.remove(calc);
            }else{
                map.put(calc, elem);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            return entry.getValue();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(singleNumber(arr));

    }
}
