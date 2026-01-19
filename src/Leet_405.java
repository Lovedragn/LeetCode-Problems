public class Leet_405 {
    public static String toHex(int num) {
        StringBuilder res = new StringBuilder();
        String c = "0123456789abcdef";
        while(num != 0){
            int temp = num &15;
            res.append(c.charAt(temp));
            num >>>=4;
        }
        return res.reverse().toString();
    }

    public static void main(String args[]) {
        System.out.println(toHex(26));
    }
}
