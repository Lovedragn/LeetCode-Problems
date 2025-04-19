
public class Leet_6 {

    public static String convert(String s, int numRows) {
        StringBuilder res = new StringBuilder();
        Character[][] arr = new Character[numRows][s.length() / 2];
        boolean trigger = false;
        int idx = 0;
        int boundry = -1;

        for (int i = 0; i < s.length() / 2; i++) {
            if (trigger && boundry > 0) {
                boundry--;
                arr[boundry][i] = s.charAt(idx);
            } else {
                for (int j = 0; j < numRows; j++) {
                    arr[j][i] = s.charAt(idx);
                    boundry++;
                    idx++;
                }
                trigger = true;
                continue;
            }
            
            idx++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                
                if (arr[i][j] != null) {
                    res.append(arr[i][j]);
                }else{
                    arr[i][j] = '@';   
                }
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(str, numRows)); // Output: "PAHNAPLSIIGYIR"
    }
}
//[P]   [A]   [H]   [N]
//[A][P][L][S][I][I][G]
//[Y]   [I]   [R]
