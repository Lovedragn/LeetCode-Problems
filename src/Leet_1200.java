import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_1200 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        if(arr.length < 2){
            return list;
        }
        
        int MIN_ABSOLUTE = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            int l =  arr[i];
            int r = arr[i+1];

            int abs = Math.abs(l - r);
            List<Integer> temp = new ArrayList<>();
            if(abs > MIN_ABSOLUTE) continue;
            if(MIN_ABSOLUTE > abs){
                list.clear();
                MIN_ABSOLUTE = abs;
            }
            temp.add(l);
            temp.add(r);
            list.add(new ArrayList<>(temp));

        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 8, -10, 23, 19, -4, -14, 27 };
        System.out.println(minimumAbsDifference(nums));

    }
}
