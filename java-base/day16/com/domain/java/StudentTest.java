package com.domain.java;

public class StudentTest {
  public static void main(String[] args) {
    Student student = new Student();
    student.regist(-1);
    try {
      student.regist1(-1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class Student {
  private int id;

  public void regist(int id){
    if (id >= 0) {
      this.id = id;
    } else {
      System.out.println("不能小于0");
      throw new MyExceptionTest("数据不合法");
    }
  }

  public void regist1(int id) throws Exception {
    if (id >= 0) {
      this.id = id;
    } else {
      System.out.println("不能小于0");
      throw new Exception("数据不合法");
    }
  }

}
