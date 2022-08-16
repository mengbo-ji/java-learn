package domain.java;

/**
 * @author jimengbo
 */
public class InterfaceTest {
  public static void main(String[] args) {
  }
}

interface Flyable {
  // 全局常量
  public static final int MIN_SPEED = 0;
  // 省略 public static final
  int MAX_SPEED = 7900;

  // 抽象方法
  public abstract void flay();
  // 省略 public abstract
  void stop();
}

interface Foo {
  void sleep();
}

interface Blow extends Flyable, Foo {
  void eat();
}

class Plane extends Object implements Flyable, Blow {

  @Override
  public void flay() {

  }

  @Override
  public void stop() {

  }

  @Override
  public void sleep() {

  }

  @Override
  public void eat() {

  }
}