package domain;

public class StaticTest {
  public static void main(String[] args) {
    Chinese c1 = new Chinese();
    c1.name = "jimengbo";
    c1.age = 18;
//    c1.country = "CHN";

    Chinese c2 = new Chinese();
    c2.name = "lvdudu";
    c2.age = 18;

    System.out.println(Chinese.country);
  }
}

class Chinese {
  static String country = "China";

  String name;
  int age;
}