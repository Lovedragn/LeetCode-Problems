
public class Leet_2073 {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                total += Math.min(tickets[i], tickets[k]);
            } else {
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        int k = 0;
        System.out.print(timeRequiredToBuy(tickets, k));

    }
}
