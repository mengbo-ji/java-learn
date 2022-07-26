package com.atguigu.com;

public class PersonTest {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "张三";
    person.age = 18;
    System.out.println(person.name);

    person.eat();
    person.sleep();
    person.talk("zh");

    Person person1 = new Person();
    person1.name = "李四";
    System.out.println(person1.name);


    Person person2 = person;
    person2.name = "王五";
    System.out.println(person2.name);
    System.out.println(person.name);

  }
}

class Person {
  String name;
  int age;
  boolean isMale;

  public void eat() {
    System.out.println("吃饭");
  }

  public void sleep() {
    System.out.println("睡觉");
  }

  public void talk(String language) {
    System.out.println("我说我的话: " + language);
  }

}
