package domain;

import java.util.Comparator;
import java.util.function.Consumer;

public class BlockTest {
  public static void main(String[] args) {
//    String desc = Person.desc;
//    Person.info();
//    Person person = new Person();
    new Mengbo();
  }
}

class Person {
  String name;
  int age;
  static String desc;

  public Person() {

  }

  static {
    System.out.println("hello static 代码块");
  }

  {
    System.out.println("hello 代码块");
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println("吃饭");
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", desc='" + desc + '\'' +
            '}';
  }

  public static void info() {
    System.out.println("hh");
  }
}

final class Mengbo {
  Comparator<Integer> com = (a, b) -> Integer.compare(a, b);
  public Mengbo() {
    int res = com.compare(10, 10);
//    System.out.println(res);
//    System.out.println(com.getClass());
  }

  Comparator<Integer> cpm3 = Integer::compareTo;
  int compare3 = cpm3.compare(12, 12);
  {
    Runnable r1 = () -> {System.out.println("hello Lamdba!");};

//    System.out.println(compare3);
//    r1.run();

    Consumer<String> con = (String str) -> {System.out.println(str);};

    con.accept("我是Lambda");
    Comparator<Integer> con1 = (o1,o2) -> {
      System.out.println("Lamdba表达式使用");
      return Integer.compare(o1,o2);
    };


//    System.out.println(con1.compare(10, 10));

    Comparator<Integer> com2 = (o1, o2) -> {
      System.out.println(o1);
      System.out.println(o2);
      return o1;
    };
    System.out.println(com2.compare(23, 12));

  }

}
