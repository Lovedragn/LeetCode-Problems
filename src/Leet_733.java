public class Leet_733{
     public static  int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]  == color) return image;
        populate(image , color ,image[sr][sc], sr , sc );

        return image;
    }

    public static void populate(int[][] image  , int color,int select , int sr , int sc){
        if(sr >= image.length || sc >= image[0].length || sr < 0 || sc < 0 || image[sr][sc] != select) {
            return;
        }

        if(image[sr][sc] == select || image[sr][sc] == color){
            image[sr][sc] = color;
            populate(image, color, select, sr + 1, sc);
            populate(image, color, select, sr, sc+1);
            populate(image, color, select, sr - 1, sc);
            populate(image, color, select, sr, sc - 1);
        
        }

    }
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;
        int[][] result = floodFill(image, sr, sc, newColor);
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}