
public class Leet_2894 {

    public static int differenceOfSums(int n, int m) {
        int l=0;
        int r=0;
        for (int i = 1; i <= n; i++) {
            if (i%m != 0) {
                l+=i;
            }
              if (i%m == 0) {
                r+=i;
            }
        }
  
        return (l-r);
    }

    public static void main(String[] args) {
        System.out.println(differenceOfSums(10, 3));
    }
}
