public class Leet_832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        if (image.length == 1) {

            return new int[][] { { image[0][0] ^ 1 } };
        }

        for (int i = 0; i < image.length; i++) {
            int l = 0;
            int r = image[0].length - 1;

            while (l <= r) {

                int temp = image[i][l];
                image[i][l] = 1 ^ image[i][r];
                image[i][r] = 1 ^ temp;
                l++;
                r--;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = { { 1,1,0 },{1,0,1},{0,0,0} };
        int[][] res = flipAndInvertImage(image);
        for (int[] is : res) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
    }
}
