package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sumMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            sumMonth += sales[i];
        }
        return sumMonth;

    }

    public int averageSales(int[] sales) {
        int averageMonth = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
                averageMonth = sum / sales.length;
            }
        }
        return averageMonth;
    }
    public int belowAverageSales(int [] sales) {
        StatsService StatsService = new StatsService();
        int actualSumAvg = StatsService.averageSales(sales);
        int belowAverageMonth =0;
        for (int i = 0; i < sales.length; i++) {
            if (sales [i] < actualSumAvg) {
        belowAverageMonth += 1;
            }
        }
        return belowAverageMonth;
    }

    public int aboveAverageSales(int [] sales) {
        StatsService StatsService = new StatsService();
        int actualSumAvg = StatsService.averageSales(sales);
        int aboveAverageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > actualSumAvg) {
                aboveAverageMonth += 1;
            }
        }
        return aboveAverageMonth;
    }
}
