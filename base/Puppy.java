public class Puppy {
  int puppyAge;
  public Puppy(String name) {
    System.out.println("小狗的名字为: " + name);
  }

  public void setAge(int age) {
    puppyAge = age;
  }

  public int getAge() {
    System.out.println("小狗的年龄为: " + puppyAge);
    return puppyAge;
  }

  public static void main(String[] args) {
    Puppy myPuppy = new Puppy("Tom");
    myPuppy.setAge(2);

    int age = myPuppy.getAge();
    System.out.println("age: " + age);
    System.out.println("变量值: " + myPuppy.puppyAge);
  }
}