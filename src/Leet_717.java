public class Leet_717 {

    public static boolean isOneBitCharacter(int[] bits) {
        int i=0;

        while(bits.length > i){
            if(1 == bits[i]){
                i++;
                if(bits.length -1 == i){
                   return false; 
                }
            }
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        int bits[] = { 1, 1, 1, 0 };
        System.out.println(isOneBitCharacter(bits));
    }
}
