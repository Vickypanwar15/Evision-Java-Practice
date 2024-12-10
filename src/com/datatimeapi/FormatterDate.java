package com.datatimeapi;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Formatter;

public class FormatterDate {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();
        System.out.println(d);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MM,YYYY");
        System.out.println(df.format(d));

        LocalDate date = LocalDate.of(2002,9,15);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());


        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(time.plusMinutes(20));
        System.out.println(time.plusHours(2));
    }
}
