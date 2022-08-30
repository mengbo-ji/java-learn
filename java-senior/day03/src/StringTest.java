import org.junit.Test;

/**
 * @author jimengbo
 * @create 2022-08-29 11:10 PM
 */
public class StringTest {

  @Test
  public void test1() {
    String s1 = "abc";
    String s2 = "abc";

    System.out.println(s2.intern());

    System.out.println(s1 == s2); // true

    String s3 = new String("abc");
    String s4 = new String("abc");

    System.out.println(s1 == s3); // false
    System.out.println(s3 == s4); //false

    Person p1 = new Person("Tom", 12);
    Person p2 = new Person("Tom", 12);

    System.out.println("******************8");
    System.out.println(p1.name.equals(p2.name));
    System.out.println(p1.name == p2.name);

  }
}
