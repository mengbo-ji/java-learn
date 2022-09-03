package com.atguigu.java;

import org.testng.annotations.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author jimengbo
 * @create 2022-09-03 3:59 PM
 */
public class JDK8DateTimeTest {
  @Test
  public void test1() {
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.now();

    System.out.println(localDate);
    System.out.println(localTime);
    System.out.println(localDateTime);

    // of 没有偏移量
    LocalDateTime localDateTime1 = LocalDateTime.of(2022, 9, 2, 13, 24);
    System.out.println(localDateTime1);

    // getXXX
    System.out.println(localDateTime.getDayOfMonth());
    System.out.println(localDateTime.getDayOfWeek());
    System.out.println(localDateTime.getMonth());
    System.out.println(localDateTime.getMonthValue());

    LocalDate localDate1 = localDate.withDayOfMonth(22);
    System.out.println(localDate);
    System.out.println(localDate1);

    System.out.println(localDate.plusMonths(2));
    System.out.println(localDate.minusMonths(2));
  }

  @Test
  public void instanTest() {
    Instant instant = Instant.now();
    System.out.println(instant);

    OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
    System.out.println(offsetDateTime);

    long l = instant.toEpochMilli();
    System.out.println(l);

    Instant instant1 = Instant.ofEpochMilli(1662193207180L);
    System.out.println(instant1);
  }

  @Test
  public void testDateTimeFormatter() {
    DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);
    System.out.println(d1.format(localDateTime));

    DateTimeFormatter d2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
    System.out.println(d2.format(localDateTime));


  }

}
