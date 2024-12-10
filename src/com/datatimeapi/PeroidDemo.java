package com.datatimeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeroidDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Period p = Period.between(LocalDate.of(2002,9,15),date); // date - local date.of()
        System.out.println("difference between to dates");
        System.out.println(p.getYears()+" : "+p.getMonths()+" : "+p.getDays());
    }
}
