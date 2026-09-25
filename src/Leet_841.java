import java.util.*;

public class Leet_841 {
    public static long l;
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.isEmpty())
            return true;
        Queue<Integer> q = new LinkedList<>();
        l = 0;
        for (int i = 1; i < rooms.size(); i++) {
            l += i;
        }
        boolean visited[] = new boolean[rooms.size()];
        visited[0] = true;
        room_search(rooms, visited, q,  0);
        System.out.println(l);
        return l != 0 ? false : true;
    }

    public static void room_search(List<List<Integer>> rooms, boolean visited[], Queue<Integer> q, int index) {
        
        for (Integer s : rooms.get(index)) {
            if (!visited[s]) {
                q.offer(s);
                visited[s] = true;

                l -= s;
                System.out.println(l);
            }
        }if (q.isEmpty()) {
            return;
        }
        int w = q.poll();
        room_search(rooms, visited, q,  w);

    }

    public static void main(String args[]) {
        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1,3),
                Arrays.asList(3,0,1),
                Arrays.asList(2),
                Arrays.asList(0));

        System.out.println(canVisitAllRooms(rooms));
    }
}
