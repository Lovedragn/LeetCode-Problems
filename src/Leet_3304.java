public class Leet_3304 {
    public static StringBuilder word = new StringBuilder("a");

    public static char kthCharacter(int k) {
        Character res = '5';
        recursion(k ,res);
        return word.charAt(k-1);
    }

    public static void recursion(int k,char cc) {
        if (k < word.length()) {
            cc = word.charAt(k);
            return ;
        }
        int i = 0;
        int size = word.length()-1;
        while (size >= i) {
            char c = word.charAt(i);
            int s = c + 1;
            if (s < 122) {
                word.append((char)s);
            } else {
                word.append('a');
            }

            i++;
        }
        recursion(k , cc);
        
    }

    public static void main(String[] args) {
        int k = 5;
        System.out.println(kthCharacter(k));//abbcbccd
    }
}
