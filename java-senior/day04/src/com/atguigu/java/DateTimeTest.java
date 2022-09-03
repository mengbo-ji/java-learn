package com.atguigu.java;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author jimengbo
 * @create 2022-09-03 3:18 PM
 */
public class DateTimeTest {

  @Test
  public void testSimpleDateFormat() {
    SimpleDateFormat sdf = new SimpleDateFormat();

    Date date = new Date();

    String format = sdf.format(date);

    System.out.println(format);

    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
    String format1 = sdf1.format(date);
    System.out.println(format1);
  }

  @Test
  public void testCalendar() {
    Calendar calendar = Calendar.getInstance();

    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
  }
}
