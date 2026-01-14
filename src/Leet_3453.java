public class Leet_3453 {

    public static double separateSquares(int[][] squares) {
        double minY = getmin(squares);
        double maxY = getmax(squares);
        double precicion = 1e-5;

        // binary search
        while (maxY - minY > precicion) {
            double midY = (maxY + minY) / 2;
            if (islowesthaslarger(squares, midY)) {
                maxY = midY;
            } else {
                minY = midY;
            }
        }
        return minY;
    }

    public static double getmin(int[][] squares) {
        double minY = 1e10;
        for (int[] is : squares) {
            minY = Math.min(is[1], minY);
        }
        return minY;
    }

    public static double getmax(int[][] squares) {
        double maxY = 1e-10;
        for (int[] is : squares) {
            maxY = Math.max(is[1] + is[2], maxY);
        }
        return maxY;
    }

    public static boolean islowesthaslarger(int[][] squares , double midY){
        double upperarea=0,lowerarea =0;
        for (int[] square : squares) {
            double bottomY = square[1],side = square[2],topY = side + bottomY;
            if(topY <= midY){
                lowerarea += side * side;
            }else if(bottomY >= midY){
                upperarea += side * side;
            }else{
                double below = midY - bottomY, above = topY - midY;
                lowerarea += below * side;
                upperarea += above * side;
            }
        }
        return lowerarea >= upperarea;
    }

    public static void main(String[] args) {
        Leet_3453 solver = new Leet_3453();
        int[][] squares = {
                { 0, 0, 2 },
                { 1, 1, 1 }
        };
        double result = solver.separateSquares(squares);
        System.out.println(result);
    }
}