package ru.netology.stats;
   public class Main {
        public static void main(String[] args) {
             StatsService service = new StatsService();
             long[] purchases = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
             long currentMin = service.calculateMinAverage(purchases);
             System.out.println(currentMin);
        }
   }