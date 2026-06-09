import java.util.HashSet;

public class Leet_3043 {
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> arr1_set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            String str = Integer.toString(arr1[i]);
            for (int j = 1; j <= str.length(); j++) {
                arr1_set.add(str.substring(0, j));
            }
        }

        int res = 0;
        for (int i = 0; i < arr2.length; i++) {
            String str = Integer.toString(arr2[i]);
            for (int j = 1; j <= str.length(); j++) {
                String temp = str.substring(0 , j);
                if(arr1_set.contains(temp)){
                    res = Math.max(res, temp.length());
                }
            }
        }
        return res;
    }

public static void main(String[] args) {
    int[] arr1 = {123987, 567890, 234567, 890123, 456789};
    int[] arr2 = {908123, 456123, 789012, 234567};
    System.out.println(longestCommonPrefix(arr1, arr2));
}
}