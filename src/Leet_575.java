import java.util.HashSet;

public class Leet_575 {

    public int distributeCandies(int[] candyType) {
        int n = candyType.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : candyType) {
            set.add(integer);
        }

        int count = set.size();
        return n < count ? n : count;

    }
}
