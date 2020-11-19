package ru.netology.stats;

public class StatsService<average> {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long calculateAverage(long average) {
        long sum = 0;
        long purchase = 0;
        long month = purchase;
        long purchases = month;
        for (purchase = 0; month < 13; purchases = month + month) {
            average = purchases / 12;
        }
        return average;
    }

    public long calculateSaleMax(long maxSale, long average) {
        long monthnumber = 0;
        long sum = 0;
        long monthnumber = sum;
        for (monthnumber = 0; monthnumber < 12; average = sum + monthnumber++ / 12) {
            maxSale >= average;
        }
        return maxSale;
    }

    public long calculateSaleMin(long minSale, long average) {
        long sum = 0;
        long monthnumber = 0;
        long monthnumber = sum;
        for (monthnumber = 0; monthnumber < 12; average = sum + monthnumber++ / 12) {
            minSale<average ;
        }
        return minSale;
    }
}

