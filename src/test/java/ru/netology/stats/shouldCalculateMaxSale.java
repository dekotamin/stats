package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSaleMax() {
        StatsService service = new StatsService();
        long [] monthnumber = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 1, 3, 4, 5, 6, 7, 11;
        long actual = service.calculateSum(monthnumber);
        assertEquals(expected, actual);
    }
