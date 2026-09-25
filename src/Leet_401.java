import java.util.ArrayList;
import java.util.List;

public class Leet_401 {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 64; j++) {
                if (Integer.bitCount((i * 60) + j) == turnedOn) {
                    
                    String str =String.format("%d:%02d",i,j);
                    res.add(str);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(1));
    }
}
