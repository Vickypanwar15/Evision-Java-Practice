package com.august14;

import java.util.Scanner;

public class FindDaysinMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number");
        int num = scanner.nextInt();
        int daysiInMonth=0;
        System.out.println("Enter Year ");
        int year = scanner.nextInt();
        String month="";
        switch (num) {
            case 1:
                month = "January";
                daysiInMonth=31;
                break;
            case 2:
                month = "February";
                if( (year%4==0) || (year%400==0)){
                    daysiInMonth=29;
                }
                else{
                    daysiInMonth=28;
                }
                break;
            case 3:
                month = "March";
                daysiInMonth=31;
                break;
            case 4:
                month = "April";
                daysiInMonth=30;
                break;
            case 5:
                month = "May";
                daysiInMonth=31;
                break;
            case 6:
                month = "June";
                daysiInMonth=30;
                break;
            case 7:
                month = "July";
                daysiInMonth=31;
                break;
            case 8:
                month = "August";
                daysiInMonth=31;
                break;
            case 9:
                month = "September";
                daysiInMonth=30;
                break;
            case 10:
                month = "October";
                daysiInMonth=31;
                break;
            case 11:
                month = "November";
                daysiInMonth=30;
                break;
            case 12:
                month = "December";
                daysiInMonth=31;
                break;
            default:
                System.out.println("Invalid day");

        }
        System.out.println(month + " "+year +" has "+daysiInMonth);

    }
}
