public class Leet_2749 {
    public static int makeTheIntegerZero(int num1, int num2) {
        // true => current value > pre value
        
        for (int i = 0; i <= 60; i++) {
            Long l = (long) num1 - (long) num2 * i;
            if(l < i) continue;
            if( Long.bitCount(l) <= i) return i;  
        }
        return -1;
    }


    public static void main(String args[]) {
        System.out.println(makeTheIntegerZero(3, -2));// 3
    }
}
