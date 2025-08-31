import java.util.*;

public class Leet_119 {
     public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }
            newRow.add(1);
            row = newRow;
        }

        return row;        
    }
    public static void main(String[] args) {
       
        System.out.println(getRow(4)); // Output: [1, 4, 6, 4, 1]
    }
}
