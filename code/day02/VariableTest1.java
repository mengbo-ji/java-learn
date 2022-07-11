
class VariableTest1 {
  public static void main(String[] args) {
    byte b1 = 2;
    int i1 = 123;
    int i2 =  b1 + i1;
    System.out.println(i2);

    double d1 = 12.9;
    int i3 = (int)d1;// 取整
    System.out.println(i3);

    int i4 = 128;
    byte b = (byte)i4; // -128
    System.out.println(b);
  }
}
