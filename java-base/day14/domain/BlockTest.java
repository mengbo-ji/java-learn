package domain;

public class BlockTest {
  public static void main(String[] args) {
    String desc = Person.desc;
    Person.info();
    Person person = new Person();
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

final class mengbo extends Person {

}
