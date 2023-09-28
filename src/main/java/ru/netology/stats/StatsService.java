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
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;

    }

    public int averageSales(int[] sales) {
        int sum = 0;
        int avgSum;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        avgSum = sum / sales.length;
        return avgSum;
    }

    public int belowAverageSales(int[] sales) {
        StatsService StatsService = new StatsService();
        int actualSumAvg = StatsService.averageSales(sales);
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < actualSumAvg) {
                belowAverage += 1;
            }
        }
        return belowAverage;
    }

    public int aboveAverageSales(int[] sales) {
        StatsService StatsService = new StatsService();
        int actualSumAvg = StatsService.averageSales(sales);
        int aboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > actualSumAvg) {
                aboveAverage += 1;
            }
        }
        return aboveAverage;
    }
}
