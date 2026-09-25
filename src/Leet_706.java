
import java.util.*;

public class Leet_706 {

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);

        System.out.println("get 2 : " + map.get(2));
        map.remove(2);
        System.out.println(map.list);
    }
}

class MyHashMap {

    public static LinkedList<int[]> list;

    public MyHashMap() {
        list = new LinkedList<>();
    }

    public void put(int key, int value) {
        list.add(new int[]{key, value});
    }

    public int get(int key) {
        int i = 0;
        while (list.size() > i) {
            int arr[] = list.get(i);
            if (arr[0] == key) {
                break;
            }
            i++;
        }
        int arr [] = list.get(i);
        return arr[1];
    }

    public void remove(int key) {
        int i = 0;
        while (list.size() > i) {
            int arr[] = list.get(i);
            if (arr[0] == key) {
                list.remove(arr);
            }
            i++;
        }
    }
}
