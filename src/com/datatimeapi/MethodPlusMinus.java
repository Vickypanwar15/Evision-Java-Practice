package com.datatimeapi;

import java.time.LocalDateTime;

public class MethodPlusMinus {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.now();
        System.out.println(d1);
//        Adding 1 year 1 month 1 week and 1 day
        System.out.println("Updating date and time");
        LocalDateTime d2 =d1.plusYears(1).plusMonths(1).plusWeeks(1).plusDays(1);
        System.out.println(d2);

//        Subtracting 1 year 1 month 1 week and 1 day
        LocalDateTime d3 = d2.minusYears(1).minusMonths(1).minusWeeks(1).minusDays(1);
        System.out.println(d3);
    }
}
