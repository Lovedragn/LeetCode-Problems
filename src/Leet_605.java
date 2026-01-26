public class Leet_605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            boolean left = i == 0 || flowerbed[i - 1] == 0;
            boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
            if (left == true && right == true && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                cnt++;
            }
        }
        return n <= cnt;
    }
}
