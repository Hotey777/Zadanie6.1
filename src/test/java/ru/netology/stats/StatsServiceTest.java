package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void SumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        assertEquals(actual, expected);

    }

    @Test
    public void MiddleSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.middle(sales);
        long expected = 15;

        assertEquals(actual, expected);
    }

    @Test
    public void MaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSales(sales);
        long expected = 8;

        assertEquals(actual, expected);
    }

    @Test
    public void MinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minSales(sales);
        long expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    public void UnderMiddle() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.underMid(sales);
        long expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    public void UpperMiddle() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.upperMid(sales);
        long expected = 5;

        assertEquals(actual, expected);
    }
}
