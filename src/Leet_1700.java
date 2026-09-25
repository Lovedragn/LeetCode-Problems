import java.util.*;
public class Leet_1700 {

    public static int countStudents(int[] students, int[] sandwiches) {
        int res =sandwiches.length;
        HashMap<Integer , Integer> map  = new HashMap<>();
        for(int elem : students){
            map.put(elem, map.getOrDefault(elem, 0)+1);
        }

        for(int i=0;i<sandwiches.length;i++){
            if (map.getOrDefault(sandwiches[i],0).equals(0) ) {
                return res;
            }
            res--;
            map.put(sandwiches[i],map.get(sandwiches[i])-1);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] stundent = {1,1};
        int[] sand = {1,0};
        System.out.println(countStudents(stundent, sand));
    }
}
