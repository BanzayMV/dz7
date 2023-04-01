package ru.netology.stats;

public class StatsService {
    // Сумма всех продаж.
    public long allSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }

    // Средняя сумма продаж в месяц.
    public long mediumSales(long[] sales) {
        long sum = allSales(sales);

        return sum / sales.length;

    }

    // Номер месяца, в котором был пик продаж.
    public int findMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    // Номер месяца, в котором был минимум продаж.
    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев, в которых продажи были ниже среднего.

    public int calculatelowsale(long[] sales) {
        long average = mediumSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // Количество месяцев, в которых продажи были выше среднего.
    public int calculateuppsale(long[] sales) {
        long average = mediumSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}