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
        long average = purchases[0];
        for (long purchase : purchases) {
            average = average / 12;
        }
        return average;
    }

    public long calculateMax(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases)
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        return currentMax;
    }

    public long calculateMin(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }
        public long calculateMinAverage(long[] purchases) {
            long currentMin = purchases[0];
            long average = currentMin / 12;
            for (long purchase : purchases) {
                if (currentMin < average) {
                    currentMin = currentMin;
                }
            }
                return currentMin;
    }
        public long calculateMaxAverage(long[] purchases) {
        long currentMax = purchases[0];
        long average = currentMax / 12;
        for (long purchase =0; purchase < 12; purchase++) {
            if (currentMax > average) {
                currentMax = average;
            }
        }
            return currentMax;
    }
}