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
    int num = scan.nextInt();

    System.out.println(num);
  }
}
