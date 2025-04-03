
public class Leet_28 {

    public static int strStr(String haystack, String needle) {
        int result = -1;

        int sliding = needle.length();
        for (int  i = 0; i < haystack.length() - sliding+1; i++) {
            if (haystack.substring(i, sliding+i).equals(needle)) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String haystack = "sadasad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}
