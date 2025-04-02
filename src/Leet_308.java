import java.util.*;

public class Leet_308 {
    public static List<Integer> list;
    public static Map<Integer, Integer> map;
    public static Random rand;

    public static void RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public static boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // Value already exists
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public static boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // Value does not exist
        }
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Swap the element to remove with the last element
        list.set(index, lastElement);
        map.put(lastElement, index);

        // Remove the last element
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public static int getRandom() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return (Integer)list.get(rand.nextInt(list.size()));
    }

    public static void main(String[] args) {
        System.out.println(insert(1)); // true
        System.out.println(remove(2)); // false
        System.out.println(insert(2)); // true
        System.out.println(getRandom()); // Randomly 1 or 2
        System.out.println(remove(1)); // true
        System.out.println(insert(2)); // false (already exists)
        System.out.println(getRandom()); // Always 2
    }
}
