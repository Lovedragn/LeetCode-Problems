
public class Leet_2469 {

    // (farenheit × 9/5) + 32
    // kelvin + 273.15
        public static double[] convertTemperature(double celsius) {
            double[] res = new double[2];
                res[0] = celsius+273.15;
                res[1] = ((celsius*9)/5)+32;
            return res;
        }

    public static void main(String[] args) {
        double c = 36.50;
        double[] res = convertTemperature(c); 
        for(double elem : res){
            System.out.println(elem);
        }
    }
}
