package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum / purchases.length;
    }

    public long calculateMax(long[] purchases) {
        long currentMax = purchases[0];
        long monthnumber = 0;
        long currentnumber = 1;
        for (long purchase : purchases) {
            if (currentMax <= purchase) {
                currentMax = purchase;
                monthnumber = currentnumber;
            }
            currentnumber++;
        }
        return monthnumber;
    }

    public long calculateMin(long[] purchases) {
        long currentMin = purchases[0];
        long monthnumber = 0;
        long currentnumber = 1;
        for (long purchase : purchases) {
            if (purchase <= currentMin) {
                currentMin = purchase;
                monthnumber = currentnumber;
            }
            currentnumber++;
        }
        return monthnumber;
    }

    public long calculateMinAverage(long[] purchases) {
        long currentMin = purchases[0];
        long average = currentMin / purchases.length;
        for (long purchase : purchases) {
            if (purchase <= average) {
                currentMin = average;
            }
            currentMin++;
        }
        return currentMin++;
    }

    public long calculateMaxAverage(long[] purchases) {
        long average = purchases[0] / purchases.length;
        long currentInMax = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                currentInMax++;
            }
            return currentInMax;
        }
    }
}