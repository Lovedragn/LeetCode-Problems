
public class Leet_771 {

    public static int numJewelsInStones(String jewels, String stones) {
        int res = 0;

        for (int i = 0; i < stones.length(); i++) {
            char c =  stones.charAt(i);
            if (jewels.contains(String.valueOf(c))) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String jews = "aB";
        String stones = "aBAAAa";//3
        System.out.println(numJewelsInStones(jews, stones));

    }
}
