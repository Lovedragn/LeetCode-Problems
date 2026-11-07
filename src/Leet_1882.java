import java.util.PriorityQueue;

public class Leet_1882 {
    public static int[] assignTasks(int[] servers, int[] tasks) {
        // [weight, index] - Ordered by smallest weight, then smallest index
        PriorityQueue<int[]> availableServers = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        // [available_time, weight, index] - Ordered by earliest time, then weight, then index
        PriorityQueue<int[]> usedServers = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            if (a[1] != b[1]) return a[1] - b[1];
            return a[2] - b[2];
        });

        // Initialize all servers as available
        for (int i = 0; i < servers.length; i++) {
            availableServers.add(new int[]{servers[i], i});
        }

        int n = tasks.length;
        int[] res = new int[n];
        int time = 0;

        for (int i = 0; i < n; i++) {
            // A task cannot be scheduled before its arrival time (i)
            time = Math.max(time, i);

            // If no servers are available, fast-forward time to when the next server frees up
            if (availableServers.isEmpty()) {
                time = usedServers.peek()[0];
            }

            // Free all servers whose tasks are finished by the current 'time'
            while (!usedServers.isEmpty() && usedServers.peek()[0] <= time) {
                int[] curr = usedServers.poll();
                // Add back to available: {weight, index}
                availableServers.add(new int[]{curr[1], curr[2]}); 
            }

            // Assign the task to the best available server
            int[] bestServer = availableServers.poll();
            res[i] = bestServer[1];

            // Add server to used queue: {new_available_time, weight, index}
            // Note: The new time is current time + duration of the task (tasks[i])
            usedServers.add(new int[]{time + tasks[i], bestServer[0], bestServer[1]});
        }

        return res;
    }

    public static void main(String[] args) {
        int[] servers = {3, 3, 2};
        int[] tasks = {1, 2, 3, 2, 1, 2};
        int[] res = assignTasks(servers, tasks);

        // Expected Output: 2 2 0 2 1 2
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}