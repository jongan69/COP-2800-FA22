
/*
Assignment 3.11
Prompt:
3.11 (Find the number of days in a month) Write a program that prompts the user to enter the month and year and displays the number of days in the month.

For example, if the user entered month 2 and year 2012, the program should display that February 2012 had 29 days.

If the user entered month 3 and year 2015, the  program should display that March 2015 had 31 days

*/
//     Calendar c = Calendar.getInstance();
//     int monthMaxDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//    int daysInCurrentMonth = java.time.LocalDate.now().lengthOfMonth();
//     System.out.println(daysInCurrentMonth);
//     int days1 = Month.FEBRUARY.minLength();  // 28
//     int days2 = Month.FEBRUARY.maxLength();  // 29
//     int days3 = Month.FEBRUARY.length( boolean_consider_leap_year );
//     System.out.println(days1);
//     System.out.println(days2);
//     System.out.println(days3);

//     First Take in input for month
//     1-12
//     Second take in input for year

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter month (1-12): ");
    int year = sc.nextInt();
    System.out.println("Please enter year: ");
    int month = sc.nextInt();
    System.out.println("Number of days in " + year + " " + month);
    System.out.println(display(year, month));
  }

  // ALG:
  // 1. crete calender instance
  // 2. look up year and month in calender
  // 3. days in month returned from getActualMaximum of month
  // Return Days in month

  public static int display(int year, int month) {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.YEAR, year);
    cal.set(Calendar.MONTH, month);
    int DAY_OF_MONTH = cal.getActualMaximum(cal.DAY_OF_MONTH);
    return DAY_OF_MONTH;
  }
}
