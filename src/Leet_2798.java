    public class Leet_2798 {
        public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            int count =0;
            for (int i : hours) {
                if(target <= i){
                    count ++;
                }
            }
            return count;
        }

    public static void main(String args[]) {
        int[] hours = {0,1,2,3,4,5,6};
        System.out.println(numberOfEmployeesWhoMetTarget(hours, 4));
    }
}
