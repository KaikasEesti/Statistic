package ru.netology.stats.StatsService;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage (int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int minSales (int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxMonth (int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateLowerAvg (int[] sales) {
        int monthAmount = 0;
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        for (int monthSale : sales ) {
            if (monthSale < calculateAverage(sales)) {
                monthAmount += 1;
            }
        }
        return monthAmount;
    }

    public int calculateHighAvg (int[] sales) {
        int monthSum = 0;
        int sum = 0;
        for ( int monthSale : sales) {
            sum += monthSale;
        }

        for ( int monthSale : sales ) {
            if (monthSale > calculateAverage(sales)) {
                monthSum += 1;
            }
        }
        return monthSum;
    }
}

