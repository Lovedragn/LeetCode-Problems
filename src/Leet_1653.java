public class Leet_1653 {

    public static int minimumDeletions(String s) {

        int bCount = 0;
        int deletions = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'b') {
                bCount++;
            } else { // ch == 'a'
                deletions = Math.min(deletions + 1, bCount);
            }
        }

        return deletions;
    }

    public static void main(String[] args) {
        String s = "aababbab";
        System.out.println(minimumDeletions(s));

    }
}
