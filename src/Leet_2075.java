public class Leet_2075 {
    public static String decodeCiphertext(String encodedText, int rows) {
        StringBuilder res = new StringBuilder();
        char[][] arr = new char[rows][encodedText.length() / rows];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = encodedText.charAt(idx);
                idx++;
            }
        }

         // Traverse diagonally starting from each column in the first row
        for (int startCol = 0; startCol < encodedText.length() / rows; startCol++) {
            int r = 0, c = startCol;
            while (r < rows && c < encodedText.length() / rows) {
                res.append(arr[r][c]);
                r++;
                c++;
            }
        }


        return res.toString().trim();
    }

    public static void main(String[] args) {
        String encode = "iveo    eed   l te   olc";
        int rows = 4;
        System.out.println(decodeCiphertext(encode, rows));
    }
}
