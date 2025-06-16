

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
    }

    // Optimized version using memoization
    public static double calculateFutureValueMemo(double presentValue, double rate, int years, Double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != null) return memo[years];
        memo[years] = (1 + rate) * calculateFutureValueMemo(presentValue, rate, years - 1, memo);
        return memo[years];
    }

    public static void main(String[] args) {
        double presentValue = 1000;
        double rate = 0.05;
        int years = 5;

        System.out.println("Recursive Future Value: " + calculateFutureValue(presentValue, rate, years));

        Double[] memo = new Double[years + 1];
        System.out.println("Memoized Future Value: " + calculateFutureValueMemo(presentValue, rate, years, memo));
    }
}