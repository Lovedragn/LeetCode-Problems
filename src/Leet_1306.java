public class Leet_1306 {
    public static boolean canReach(int[] arr, int start) {
        boolean visited[] = new boolean[arr.length];
        return recursion(arr, start , visited);
    }

    public static boolean recursion(int[] arr, int index , boolean[] visited) {
        if(index < 0 || index >= arr.length ){
            return false;
        }
        if(visited[index]){
            return false;
        }
        visited[index] = true;
        if(arr[index] == 0){
            return true;
        }
        boolean right= recursion(arr, arr[index] + index , visited ); 
        boolean left = recursion(arr, index - arr[index] , visited); 
        
        return right || left;
    }


    public static void main(String args[]) {
        int[] arr = { 3,0,2,1,2};
        int start = 2;

        System.out.println(canReach(arr, start) ? "True" : "False");
    }
}