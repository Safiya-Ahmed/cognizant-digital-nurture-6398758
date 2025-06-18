public class FinancialForecast {

    public static double forecastFutureValue(double currentValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case
        return forecastFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0;   // Starting amount
        double growthRate = 0.05;       // 5% growth rate
        int years = 5;                  // Forecast for 5 years

        double futureValue = forecastFutureValue(currentValue, growthRate, years);

        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);
    }
}

