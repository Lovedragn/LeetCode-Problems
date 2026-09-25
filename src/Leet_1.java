
import java.util.HashMap;

class Leet_1 {
   public static HashMap<Integer, Integer> map = new HashMap();

   public static int[] twoSum(int[] var0, int var1) {
      return my_fun(0, var0, var1);
   }

   public static int[] my_fun(int var0, int[] var1, int var2) {
      if (var0 == var1.length) {
         return new int[0];
      } else {
         int var3 = var2 - var1[var0];
         if (map.containsKey(var3)) {
            return new int[]{(Integer)map.get(var3), var0};
         } else {
            map.put(var1[var0], var0);
            return my_fun(var0 + 1, var1, var2);
         }
      }
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
