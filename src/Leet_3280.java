
public class Leet_3280 {

    public static String convertDateToBinary(String date) {
        StringBuilder res = new StringBuilder();
        int arr[] = {4, 7, 10};
        int curr = 0;
        int prev = 0;
        while (curr < arr.length) {
            String substr = date.substring(prev, arr[curr]);

            String c = Integer.toBinaryString(Integer.parseInt(substr));
            res.append((String.valueOf(c)));
            if (curr != 2) {
                res.append("-");
            }
            prev = arr[curr]+1;
            curr++;
            
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String date = "2080-02-29";
        System.out.println(convertDateToBinary(date));
    }
}
