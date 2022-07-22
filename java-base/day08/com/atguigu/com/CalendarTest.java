package com.atguigu.com;

import java.util.Calendar;

public class CalendarTest {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.DATE, 10);
    calendar.add(Calendar.DATE, 10);
    System.out.println(Calendar.YEAR);
    System.out.println(Calendar.MONDAY);
    System.out.println(calendar.get(Calendar.DATE));
    System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
  }
}
