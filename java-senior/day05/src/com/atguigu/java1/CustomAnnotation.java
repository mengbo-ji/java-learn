package com.atguigu.java1;

/**
 * @author jimengbo
 * @create 2022-09-05 10:52 PM
 */
public @interface CustomAnnotation {
  String[] value() default "hello";
}
