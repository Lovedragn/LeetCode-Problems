
public class Leet_6 {

    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        char[][] arr = new char[numRows][s.length()];
        int row = 0, col = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {
            arr[row][col] = c;

            if (goingDown) {
                if (row == numRows - 1) {
                    goingDown = false;
                    col++;
                    row--;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    goingDown = true;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for (char[] rows : arr) {
            for (char ch : rows) {
                if (ch != '\0') {
                    res.append(ch);
                }
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(str, numRows)); // Output: "PAHNAPLSIIGYIR"
    }
}
