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
        long average = sum;
        for (long purchase : purchases) {
            sum = sum + purchase;
            average = sum / purchases.length;
            }
            return average;
        }

        public long calculateMax(long[] purchases) {
        long currentMax = purchases[0];
        long monthnumber = 0;
        long currentnumber = 0;
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
        long currentnumber = 0;
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
        long sum = 0;
        long average = sum;
        long currentmin = 0;
        for (long purchase : purchases) {
            if (currentmin < average) {
                currentmin = purchase;
                currentmin = average + average;
            }
        } currentmin++;
        return currentmin;
    }

    public long calculateMaxAverage(long[] purchases) {
        long sum = 0;
        long average = sum;
        long currentmax = 0;
        for (long purchase : purchases) {
            if (currentmax > average) {
                currentmax = purchase;
                currentmax = average + average;
            }
        } currentmax++;
        return currentmax;
    }
}