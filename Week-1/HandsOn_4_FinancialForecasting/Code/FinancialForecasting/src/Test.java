public class Test {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double rate = 0.05;
        int periods = 5;

        double futureValue = calculateFutureValue(presentValue, rate, periods);
        System.out.println("Future value after " + periods + " years: " + futureValue);
    }
    public static double calculateFutureValue(double presentValue, double rate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return (1 + rate) * calculateFutureValue(presentValue, rate, periods - 1);
    }
}
