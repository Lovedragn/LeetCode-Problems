public class Leet_3516 {
      public static  int findClosest(int x, int y, int z) {
        int xx = Math.abs(z - x);
        int yy = Math.abs(z - y);
        if(xx == yy ) return 0;
        return xx < yy ? 1  : 2;
    }
    public static void main(String args[]){
        System.out.println(findClosest(0, 0, 0));

    }
}
