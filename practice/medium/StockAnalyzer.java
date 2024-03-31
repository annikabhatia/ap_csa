public class StockAnalyzer {

    public static void main(String[] args) {
        String stocks[] = {"AAPL", "GOOG", "META", "MSFT", "NVDA", "NFLX", "TSLA"};

        double stock_prices[][] = {
                {187.15, 184.22, 182.15, 181.99, 182.09, 183.92, 184.35, 186.54, 186.06, 182.16, 181.27, 186.09, 189.33, 192.30, 195.02, 195.42, 195.22, 194.27, 192.01, 190.94, 184.16},
                {138.17, 138.92, 136.39, 135.73, 138.84, 140.95, 142.28, 142.08, 142.65, 142.49, 141.47, 143.48, 146.38, 145.99, 147.04, 148.70, 151.87, 152.19, 153.51, 151.46, 140.10},
                {346.29, 344.47, 347.12, 351.95, 358.66, 357.43, 370.47, 369.67, 374.49, 367.46, 368.37, 376.13, 383.45, 381.78, 385.20, 390.70, 393.18, 394.14, 401.02, 400.06, 390.14},
                {370.87, 370.60, 367.94, 367.75, 374.69, 375.79, 382.77, 384.63, 388.47, 390.27, 389.47, 393.87, 398.67, 396.51, 398.90, 402.56, 404.87, 403.93, 409.72, 408.59, 397.58},
                {468.50, 470.26, 474.67, 474.06, 485.03, 482.09, 478.33, 492.23, 492.16, 481.24, 480.33, 485.31, 482.95, 485.71, 492.19, 544.87, 562.00, 570.42, 575.79, 562.85, 564.11},
                {481.68, 475.69, 479.98, 490.97, 522.53, 531.40, 543.50, 548.22, 547.10, 563.82, 560.53, 571.07, 594.91, 596.54, 598.73, 613.62, 616.17, 610.31, 624.65, 614.65, 610.65},
                {248.42, 238.45, 237.93, 237.49, 240.45, 234.96, 233.94, 227.22, 218.89, 219.91, 215.55, 211.88, 212.19, 208.80, 209.14, 207.83, 182.63, 183.25, 190.93, 191.59, 187.29},
        };

        calculateAndDisplayMaxGain(stocks, stock_prices);
    }

    private static void calculateAndDisplayMaxGain(String[] stocks, double[][] stock_prices) {
        for (int i = 0; i < stocks.length; i++) {
            double maxGain = 0.0;
            int startDay = 0;
            int endDay = 0;

            for (int day = 1; day < stock_prices[i].length; day++) {
                double gain = stock_prices[i][day] - stock_prices[i][day - 1];
                if (gain > maxGain) {
                    maxGain = gain;
                    startDay = day - 1;
                    endDay = day;
                }
            }

            System.out.printf("%s: Maximum Gain = $%.2f (Date Range: %02d/%02d - %02d/%02d)%n",
                    stocks[i], maxGain, startDay + 2, stock_prices[i].length, endDay + 2);
        }
    }
}