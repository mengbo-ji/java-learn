package com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author jimengbo
 * @create 2022-09-14 10:21 PM
 */
public class MapTest {

  @Test
  public void test1() {
    HashMap hashMap = new HashMap();
    hashMap.put("label", "嘤嘤嘤");
    hashMap.put("value", "A");
    hashMap.put("value", "B");
    hashMap.replace("label", "哈哈哈");
    System.out.println(hashMap.values());
    System.out.println(hashMap.keySet());
    System.out.println(hashMap.entrySet());

    System.out.println(hashMap);
  }
}
