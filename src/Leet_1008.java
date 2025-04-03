
public class Leet_1008 {

        public static String defangIPaddr(String address) {
            StringBuilder res = new StringBuilder();
            int l = 0;
            while (l < address.length()) {
                char c = address.charAt(l);
                if (c == '.') {
                    res.append("[" + "." + "]");
                } else {

                    res.append(c);
                }
            
                l++;
            }
            return res.toString();
        }

    public static void main(String[] args) {
        String address = "255.200.12.1";
        System.out.println(defangIPaddr(address));
    }
}
