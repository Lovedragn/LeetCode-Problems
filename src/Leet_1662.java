
public class Leet_1662 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String arr1 = "";
        String arr2 = "";

        for (String str : word1) {
            arr1 += str;
        }

        for (String str : word2) {
            arr2 += str;
        }

        if (arr1.equals(arr2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
