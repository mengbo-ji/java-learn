class Plastic {
  public static void main(String[] args) {
    // 整形 byte - 1个字节 short - 2个字节 init - 4个字节 long - 8个字节
    // byte范围：-128 ~ 127 
    byte b1 = 12;
    byte b2 = -128;
    // b2 = 128; // 编译不通过
    System.out.println(b1);
    System.out.println(b2);
    short s1 = 123;
    // 开发中常用int
    int i1 = 1293049;
    // 声明long型变量必须使用"l"或者"L"结尾
    long l1 = 1023850823L;
    System.out.println(l1);
  }
}