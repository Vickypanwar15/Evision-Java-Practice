package com.datatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class ShowTodayDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today Date :"+date); // FORMAT YY:MM:DD
        LocalTime time = LocalTime.now();
        System.out.println("Now Time :"+time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Local Data and Time :"+dateTime);

//        to print a particular format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");
        String formatteddate = dateTime.format(formatter);
        System.out.println("Formatted Date & Time :"+formatteddate);
    }
}
