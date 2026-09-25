import java.util.*;

public class Leet_3568 {
    static class State {
        int r;
        int c;
        int energy;
        int mask;
        int moves;

        State(int r, int c, int energy, int mask, int moves) {
            this.r = r;
            this.c = c;
            this.energy = energy;
            this.mask = mask;
            this.moves = moves;
        }
    }

    public static int minMoves(String[] classroom, int energy) {
        int[] start = new int[2];
        ArrayList<int[]> litter = new ArrayList<>();

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[0].length(); j++) {
                char c = classroom[i].charAt(j);
                if (c == 'S') {
                    start[0] = i;
                    start[1] = j;
                } else if (c == 'L') {
                    litter.add(new int[] { i, j });
                }
            }
        }
        int litterCount = litter.size();

        // All litter cleaned
        int targetMask = (1 << litterCount) - 1;

        // Map litter position -> bit number
        int[][] litterIndex = new int[classroom.length][classroom[0].length()];

        for (int[] row : litterIndex) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < litterCount; i++) {
            int r = litter.get(i)[0];
            int c = litter.get(i)[1];

            litterIndex[r][c] = i;
        }
        
        Queue<State> q = new ArrayDeque<>();

        boolean[][][][] visited = new boolean[classroom.length][classroom[0].length()][energy + 1][1 << litterCount];

        // Starting state
        q.offer(new State(start[0], start[1], energy, 0, 0));
        visited[start[0]][start[1]][energy][0] = true;

        int[] dr = { -1, 1, 0, 0 };
        int[] dc = { 0, 0, -1, 1 };

        while (!q.isEmpty()) {

            State curr = q.poll();

            // Have we cleaned everything?
            if (curr.mask == targetMask) {
                return curr.moves;
            }

            // Cannot move anymore
            if (curr.energy == 0) {
                continue;
            }

            for (int d = 0; d < 4; d++) {

                int nr = curr.r + dr[d];
                int nc = curr.c + dc[d];

                // Outside grid
                if (nr < 0 || nr >= classroom.length || nc < 0 || nc >= classroom[0].length()) {
                    continue;
                }

                // Wall
                if (classroom[nr].charAt(nc) == 'X') {
                    continue;
                }

                int newEnergy = curr.energy - 1;
                int newMask = curr.mask;

                // Litter
                if (litterIndex[nr][nc] != -1) {

                    int index = litterIndex[nr][nc];

                    newMask |= (1 << index);
                }

                // Recharge
                if (classroom[nr].charAt(nc) == 'R') {
                    newEnergy = energy;
                }

                if (!visited[nr][nc][newEnergy][newMask]) {

                    visited[nr][nc][newEnergy][newMask] = true;

                    q.offer(
                            new State(
                                    nr,
                                    nc,
                                    newEnergy,
                                    newMask,
                                    curr.moves + 1));
                }
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        String classroom[] = { "S.", "XL" };
        int energy = 2;
        System.out.println(minMoves(classroom, energy));

    }
}
