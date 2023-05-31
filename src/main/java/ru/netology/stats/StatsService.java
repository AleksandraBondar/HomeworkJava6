package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int allSales = 0;
        for (int sale : sales) {
            allSales = allSales + sale;
        }
        return allSales;
    }

    public int average(int[] sales) {
        int allSales = sum(sales);
        int averageSale = allSales / sales.length;
        return averageSale;
    }

    public int monthMaxSales(int[] sales) {
        int monthMax = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthMinSales(int[] sales) {
        int monthMin = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int belowTheAverage(int[] sales) {
        int monthCounter = 0;
        int average = average(sales);
        for (int sale : sales) {
            if (sale < average) {
                monthCounter++;
            }
        }
        return monthCounter;
    }

    public int aboveAverage(int[] sales) {
        int monthCounter = 0;
        int average = average(sales);
        for (int sale : sales) {
            if (sale > average) {
                monthCounter++;
            }
        }
        return monthCounter;
    }
}
