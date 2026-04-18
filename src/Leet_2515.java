public class Leet_2515 {
    public static int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int dist = Math.abs(i - startIndex);
                int circularDist = n - dist;
                res = Math.min(res, Math.min(dist, circularDist));
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
        String[] arr1 = {"hello","i","am","leetcode","hello"};
        System.out.println(closestTarget(arr1, "hello", 1)); // Expected 1

        String[] arr2 = {"a","b","leetcode"};
        System.out.println(closestTarget(arr2, "leetcode", 0)); // Expected 1

        String[] arr3 = {"hello","i","am"};
        System.out.println(closestTarget(arr3, "am", 0)); // Expected 2
    }
}
