package domain.java;

public class USBTest {
  public static void main(String[] args) {
    Computer computer = new Computer();
    //
    Flash flash = new Flash();
    computer.transferData(flash);
  }
}

interface USB {
  void start();
  void stop();
}

class Computer {
  public void transferData(USB usb) {
    usb.start();

    System.out.println("具体的传输数据细节");

    usb.stop();
  }
}

class Flash implements USB {

  @Override
  public void start() {
    System.out.println("U盘开始工作");
  }

  @Override
  public void stop() {
    System.out.println("U盘结束工作");
  }
}

class Printer implements USB {

  @Override
  public void start() {
    System.out.println("打印机开始工作");
  }

  @Override
  public void stop() {
    System.out.println("打印机结束工作");
  }
}