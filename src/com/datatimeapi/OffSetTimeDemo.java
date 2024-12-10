package com.datatimeapi;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffSetTimeDemo {
    public static void main(String[] args) {
        OffsetTime time = OffsetTime.now();
        System.out.println(time);
        int h = time.get(ChronoField.HOUR_OF_DAY);
        System.out.println(h);
        int m = time.get(ChronoField.MINUTE_OF_DAY);
        System.out.println(m);
        int s = time.get(ChronoField.SECOND_OF_DAY);
        System.out.println(s);
    }
}
