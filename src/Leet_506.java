import java.util.*;
import java.util.PriorityQueue;

public class Leet_506 {
    public static String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : score) {
            q.offer(i);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            int temp = q.poll();
            map.put(temp, i);
        }

        for (int i = 0; i < str.length; i++) {
            int index = map.get(score[i]);// 0 
            if (index > 2) {
                str[i] = Integer.toString(index+1);
                continue;
            }
            if (index == 0) {
                str[i] = "Gold Medal";
            } else if (index == 1) {
                str[i] = "Silver Medal";
            } else if (index == 2) {
                str[i] = "Bronze Medal";
            }
        }

        return str;
    }

    public static void main(String args[]) {
        int[] score = { 5,4,3,2,1};
        String[] res = findRelativeRanks(score);
        for (String str : res) {
            System.out.println(str);
        }

    }
}
