
import java.util.HashMap;

public class Leet_2053 {

    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Boolean> map = new HashMap<>();
        // HashMap<Integer, Character> bucket = new HashMap<>();
        int l = 0;
        int counter = 0;
       
        while (l < arr.length) {
            if (!map.containsKey(arr[l])) {
                map.put(arr[l], true);
            } else {
                map.put(arr[l], false);
            }
            l++;

        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i])== (true)) {

                counter++;
                if (counter == k) {
                    return arr[i];
                }
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr, k));

    }
}
