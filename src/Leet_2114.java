
public class Leet_2114 {

    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for (String elem : sentences) {
            int tempcount = 0;
            String[] c = elem.split(" ");
            res = Math.max(res , c.length);
        }
        return res;
    }

    public static void main(String[] args) {
        Leet_2114 s = new Leet_2114();
        String[] str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(s.mostWordsFound(str));
    }
}
