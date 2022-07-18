/*
 * 如何从键盘获取不同类型的变量，需要用到Scanner类
 * 具体实现步骤
 * 1.导包 import java.util.Scanner
 * 2. Scanner实例化
*/
import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("请输入你的姓名:");
    String name = scan.next();
    System.out.println(name);

    System.out.println("请输入你的年龄:");
    int age = scan.nextInt();
    System.out.println(age);

    System.out.println("请输入你的体重:");
    double weight = scan.nextDouble();
    System.out.println(weight);
  }
}
