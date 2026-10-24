
import java.util.HashMap;

class Leet_1 {
  
   public static int[] twoSum(int arr[] , int target){
      HashMap<Integer , Integer> map = new HashMap<>();
      //         value   index
      int res[] = new int[2];
      
      for (int i = 0; i < arr.length; i++) {
         int cal = target - arr[i];
         if(map.containsKey(cal)){
            res[0] = map.get(cal);
            res[1] = i;
            break;
         }
         map.put(arr[i], i);
      }
      return res;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{3, 3};
      byte var2 = 6;
      int[] var3 = twoSum(var1, var2);
      int[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var4[var6];
         System.out.print("" + var7 + " ");
      }

   }
}
