public class Leet_1524 {
    public static int numOfSubarrays(int[] arr) {
        int count =0;
        int even =1;
        int odd =0;
        int current_sum =0;

        int MOD = 1_000_000_000 + 7;

        for (int i : arr) {
            current_sum += i;
            if(current_sum % 2 == 0){
                count = (count+ odd) % MOD;
                even++;
            }else{
                count = (count + even) % MOD;
                odd++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[] { 1,3,5 }));
    }
}
