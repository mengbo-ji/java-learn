public class InstanceCounter {
  private static int num = 0;

  protected static int getNum() {
    return num;
  }

  private static void setNum() {
    num++;
  }

  InstanceCounter() {
    InstanceCounter.setNum();
  }

  public static void main(String[] args) {
    System.out.println("Starting with " + InstanceCounter.getNum() + " instances");

    for (int i = 0; i < 500; ++i) {
      new InstanceCounter();
    }
    System.out.println("Created " + InstanceCounter.getNum() + " instances");
  }
}