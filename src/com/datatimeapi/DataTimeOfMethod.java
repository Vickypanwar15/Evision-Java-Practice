package com.datatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DataTimeOfMethod {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.of(2019, Month.DECEMBER,12,11,40,20,123456789);
        System.out.println(d1);

        LocalDateTime d2 = LocalDateTime.of(2014,Month.JANUARY,10,15,30,48,00123433);

        System.out.println(d2);

        System.out.println("Difference between two dates is ");
        LocalDate date1 = LocalDate.of(2019, 10,12);
        LocalDate date2 = LocalDate.of(2014,6,10);
        Period p = Period.between(date1,date2);
        System.out.println(p);
        System.out.println("Calculated the difference between days month and years using ChronoUnit");

        long days = ChronoUnit.DAYS.between(date2,date1);
        long months = ChronoUnit.MONTHS.between(date2,date1);
        long year = ChronoUnit.YEARS.between(date2,date1);
        System.out.println("Day difference :"+days);
        System.out.println("Month difference :"+months);
        System.out.println("Year difference :"+year);
    }
}
