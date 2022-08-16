package com.atguigu.java;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author jimengbo
 */
public class PayrollSystem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    System.out.println("请输入当月的月份：");
//    int month = scanner.nextInt();

    Calendar calendar = Calendar.getInstance();
    int month = calendar.get(Calendar.MONTH) + 1; // 当前月份

    Employee[] employees = new Employee[2];
    employees[0] = new SalariedEmployee("张三", 1000, new MyDate(1996, 4, 26), 20000);
    employees[1] = new HourlyEmployee("李四", 1001, new MyDate(1994, 8, 1), 100, 8);

    for(Employee item : employees) {
      System.out.println(item);
      double salary =  item.earnings();
      System.out.println("月工资为: " + salary);

      if (month == item.getBirthday().getMonth() ) {
        System.out.println(item.getName() + " 生日快乐！奖励100元");
      }
    }
  }
}
