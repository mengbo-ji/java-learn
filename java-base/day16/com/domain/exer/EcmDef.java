package com.domain.exer;

import org.junit.Test;

public class EcmDef {
  @Test
  public static void main(String[] args) {
    try {
      int i = Integer.parseInt(args[0]);
      int j = Integer.parseInt(args[1]);
      int res = ecm(i, j);
      System.out.println("res" + res);
    } catch (NumberFormatException e) {
      System.out.println("数据类型不一致");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("缺少命令行参数");
    } catch (ArithmeticException e) {
      System.out.println("除0");

    } catch (EcDef e) {
      e.printStackTrace();
    }
  }

  public static int ecm(int i, int j) throws EcDef {
    if (i < 0 || j < 0) {
      throw new EcDef("分子或分母为负数了");
    }else  {
      return i / j;
    }
  }
}
