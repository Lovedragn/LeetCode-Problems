
import java.util.*;

public class Leet_744 {

    public static char nextGreatestLetter(char[] letters, char target) {

        Arrays.sort(letters);
        int i=0;
        while( letters.length > i)
        {
            if(letters[i] > target){
                return letters[i]; 
            }
            i++;
        }
        return letters[0];

    }

    public static void main(String args[]) {
        char[] arr = {'x','x','y','y'};
        System.out.println(nextGreatestLetter(arr, 'z'));
    }
}
