
public class Leet_134 {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int currentgas = 0;
        int totalcost=0;
        int totalgas = 0;
        int currentstation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalcost+= cost[i];
            totalgas+= gas[i];
            currentgas += gas[i] - cost[i];

            if (currentgas < 0) {
                currentstation = i + 1;
                currentgas = 0;
            }
        }

        return  totalgas >= totalcost ? currentstation : -1  ;
        
    }

    public static void main(String[] args) {
        int gas[] = {2, 3, 4};
        int cost[] = {3, 4, 3};
        System.err.println(canCompleteCircuit(gas, cost));
    }
}
