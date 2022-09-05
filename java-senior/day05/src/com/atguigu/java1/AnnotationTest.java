package com.atguigu.java1;

/**
 * @author jimengbo
 * @create 2022-09-05 10:38 PM
 */
public class AnnotationTest {
  public static void main(String[] args) {
    Person p = new Student();
    p.walk();
    @SuppressWarnings("unused")
    int num = 0;

  }
}

//@CustomAnnotation(value = "hello")
@CustomAnnotation()
class Person {
  String name;
  int age;

  public Person() {};

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void walk() {
    System.out.println("人走路");
  }

  public void eat() {
    System.out.println("人吃饭");
  }

}

interface Info {
  void show();
}

class Student extends Person implements Info {

  @Override
  public void walk() {
    System.out.println("学生走路");
  }

  @Override
  public void show() {

  }
}

