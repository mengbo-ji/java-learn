package domain.java;

/**
 * @author jimengbo
 */
public class AbstractTest {
  public static void main(String[] args) {
    Xiaoming xiaoming = new Xiaoming("bogymen", 18);
    // 创建了一个匿名对象, 并不是person
    Person person = new Person() {
      @Override
      public void eat() {

      }

      @Override
      public void breath() {

      }
    };
  }
}

abstract class Creature {
  /**
   * fetch data by rule id
   * @return void
   */
  public abstract void breath();
}

abstract class Person extends Creature {
  String name;
  int age;
  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public abstract void eat();
}

class Xiaoming extends Person {

  public Xiaoming(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println("eat");
  }

  @Override
  public void breath() {
    System.out.println("breath");
  }
}

