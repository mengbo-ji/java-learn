import java.util.Scanner;

public class Utility {
  private static Scanner scanner = new Scanner(System.in);

  /**
   * 用于界面菜单的选择，读取方法键盘，如果用户键入"1"~"4"中任意字符，则方法返回。返回值为用户键入字符
   * 
   * @return {char}
   */
  public static char readMenuSelection() {
    char c;
    for (;;) {
      String str = readKeyBoard(1);
      c = str.charAt(0);
      if (c != '1' && c != '2' && c != '3' && c != 4) {
        System.out.print("选择错误, 请重新输入");
      } else {
        break;
      }
    }
    return c;
  }

  /**
   * 用于收入和支出金额的输入。该方法从键盘读取一个不超过4位超度的证书，并将其作为方法的返回值。
   * 
   * @return {int}
   */
  public static int readNumber() {
    int n;
    for (;;) {
      String str = readKeyBoard(4);
      try {
        n = Integer.parseInt(s);
      } catch (NumberFormatException e) {
        System.out.print("数字输入错误，请重新输入");
      }
    }
    return n;
  }

  /**
   * 用于收入和支持说明的输入。该方法从键盘读取一个不超过8位长度的字符串，并将其作为方法的返回值
   * 
   * @return {String}
   */
  public static String readString() {
    String str = readKeyBoard(8);
    return str;
  }

  /**
   * 用于确认选择输入。该方法从键盘读取"Y"或"N"，并将其作为方法的返回值
   * 
   * @return {char}
   */
  public static char readConfirmSelection() {
    char c;
    for (;;) {
      String str = readKeyBoard(1).toUpperCase();
      c = str.charAt(0);
      if (c == 'Y' || c == 'N') {
        break;
      } else {
        System.out.print("选择错误，请重新输入");
      }
    }
    return c;
  }

  private static String readKeyBoard(int limit) {
    String line = "";
    while (scanner.hasNext()) {
      line = scanner.nextLine();
      if (line.length() < 1 || line.length() > limit) {
        System.out.print("" + limit + "");
        continue;
      }
      break;
    }
    return line;
  }
}
