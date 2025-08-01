import java.util.*;

public class Leet_51 {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char boards[][] = new char[n][n];
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards.length; j++) {
                boards[i][j] = '.';
            }
        }

        recursion(boards, res, 0);
        return res;
    }

    public static void recursion(char[][] boards, List<List<String>> res, int row) {
        if (row == boards.length) {
            List<String> copy = new ArrayList<>();
            for (char[] i : boards) {
                copy.add(new String(i));
            }
            res.add(copy);
            return;
        }
        for (int col = 0; col < boards.length; col++) {
            if (attack(boards, row, col)) {
                boards[row][col] = 'Q';
                recursion(boards, res, row + 1);
                boards[row][col] = '.';
            }
        }

    }

    public static boolean attack(char boards[][], int row, int col) {
        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (boards[i][col] == 'Q')
                return false;
        }

        // Upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (boards[i][j] == 'Q')
                return false;
        }

        // Upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < boards.length; i--, j++) {
            if (boards[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }
}