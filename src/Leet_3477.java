import java.util.*;

public class Leet_3477 {
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int res = fruits.length;
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (baskets[j] != -1 && fruits[i] <= baskets[j]) {
                    baskets[j] = -1;
                    res--;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String args[]) {
        int[] fruits = { 4, 2, 5 };
        int[] baskets = { 3, 5, 4 };
        System.out.println(numOfUnplacedFruits(fruits, baskets));
    }
}
