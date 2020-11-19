package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum( long[] purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMax() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 1, 3, 4, 5, 6, 7, 11;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMin() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 0, 2, 8, 9, 10;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void calculateMinAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void calculateMaxAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }
}
