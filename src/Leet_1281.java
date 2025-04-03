
import com.sun.jdi.Value;
import java.util.*;

public class Leet_1281 {

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int idx = 0;
        for (int elem : groupSizes) {
            if (map.containsKey(elem)) {
                map.get(elem).add(idx);
            } else {//create a new list
                List<Integer> temp = new ArrayList<>();
                temp.add(idx);
                map.put(elem, temp);
            }
            idx++;
        }

            for (Map.Entry<Integer, List<Integer>> value : map.entrySet()) {
                int sizes = value.getKey();
                List<Integer> members = value.getValue();

                for (int i = 0; i < members.size(); i += sizes) {
                    res.add(members.subList(i, i + sizes));
                }
            
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(groupThePeople(arr));
    }
}
