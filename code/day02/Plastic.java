class Plastic {
  public static void main(String[] args) {
    //1 整形 byte - 1个字节 short - 2个字节 init - 4个字节 long - 8个字节
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

    //2. 浮点型 float(4个字节) double(8个字节)
    // 浮点型表示带小数点的值
    
    double d1 = 123.1;
    System.out.println(d1 + 1);
    
    // 定义float类型变量时 必须以小“f”或者大“F”结尾
    float f1 = 123.11F;
    System.out.println(f1);

    //3. 字符型 (1字符=2字节)
    char c1 = 'A';
    System.out.println(c1);
  }
}