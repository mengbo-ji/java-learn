package domain;


/**
 * @author jimengbo
 * @describe 单例模式的饿汉实现
 */
public class SingletonTest {
  public static void main(String[] args) {
//    Bank bank = new Bank();
    Bank bank = Bank.getInstance();
    bank.eat();
  }
}

class Bank {
  private Bank() {

  }

  private static Bank instance = new Bank();

  public static Bank getInstance() {
    return instance;
  }

  public void eat() {
    System.out.println("吃");
  }

}