package ru.netology.stats;

public class StatsService {

    private long[] purchases;

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        long average = calculateSum(purchases) / purchases.length;
        for (long purchase : purchases) {
        }
            return average;
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
        long average = calculateAverage(purchases);
        long countMonth = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                countMonth++;
            }
        }
            return countMonth;
        }

    public long calculateMaxAverage(long[] purchases){
        long average = calculateAverage(purchases);
        long countMonthMax = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                countMonthMax++;
            }
        }
        return countMonthMax;
    }
}
