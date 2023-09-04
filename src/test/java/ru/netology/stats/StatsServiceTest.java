package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindMinSalesInMonth() {
        StatsService service = new StatsService();

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(months);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindMaxSalesInMonth() {
        StatsService service = new StatsService();

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(months);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindSumSalesInMonth() {
        StatsService service = new StatsService();

        int expectedSumMonth = 180;
        int actualSumMonth = service.sumSales(months);

        Assertions.assertEquals(expectedSumMonth, actualSumMonth);
    }

    @Test
    public void shouldFindAverageSalesInMonth() {
        StatsService service = new StatsService();

        int expectedAverageMonth = 15;
        int actualAverageMonth = service.averageSales(months);

        Assertions.assertEquals(expectedAverageMonth, actualAverageMonth);
    }

    @Test
    public void shouldFindBelowAverageSalesInMonth() {
        StatsService service = new StatsService();

        int expectedBelowAverageMonth = 5;
        int actualBelowAverageMonth = service.belowAverageSales(months);

        Assertions.assertEquals(expectedBelowAverageMonth, actualBelowAverageMonth);
    }

    @Test
    public void shouldFindAboveAverageSalesInMonth() {
        StatsService service = new StatsService();

        int expectedAboveAverageMonth = 5;
        int actualAboveAverageMonth = service.belowAverageSales(months);

        Assertions.assertEquals(expectedAboveAverageMonth, actualAboveAverageMonth);
    }
}
