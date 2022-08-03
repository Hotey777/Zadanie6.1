package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public long sum(long[] sales) {          //Считаем сумму
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
    }
    return sum;
}


    public long middle(long[] sales) {       //Считаем среднее значение
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {  //Пик продаж
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {  //Минимум продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int underMid(long[] sales) {  //Количество дней с продажами ниже среднего
        int middle = (int) (Arrays.stream(sales).sum() / sales.length);
        int month = 0;
        for (long sale : sales) {
            if (sale < middle) {
                month++;
            }
        }
        return month;
    }

    public int upperMid(long[] sales) {  //Количество дней с продажами выше среднего
        int middle = (int) (Arrays.stream(sales).sum() / sales.length);
        int month = 0;
        for (long sale : sales) {
            if (sale > middle) {
                month++;
            }
        }
        return month;
    }
}
