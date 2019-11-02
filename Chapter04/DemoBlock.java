public class DemoBlock
{
  public static void main(String[] args)
  {
    System.out.println("Demonstrating block scope");
    int x = 1111;
    System.out.println("In first block, x is " + x);
    {
      int y = 2222;
      System.out.println("In second block, x is " + x);
      System.out.println("In second block, y is " + y);
    }
    {
      int y = 3333;
      System.out.println("In third block, x is " + x);
      System.out.println("In third block, y is " + y);
      demoMethod();
      System.out.println("After method, x is " + x);
      System.out.println("After method, y is " + y);
      System.out.println("First, demoMethod(x); outputs:");
      demoMethod(x);
      System.out.println("Then, demoMethod(y); outputs:");
      demoMethod(y);

    }
    System.out.println("At the end, x is " + x);
  }
  public static void demoMethod()
  {
    int x = 8888, y = 9999;
    System.out.println("In demoMethod, x is " + x);
    System.out.println("In demoMethod, y is " + y);
  }
  public static void demoMethod(int a)
  {
    int x = -1111, y = -2222;
    System.out.println("In demoMethod(int), x is " + x);
    System.out.println("In demoMethod(int), y is " + y);
    System.out.println("In demoMethod(int), a is " + a);
  }
  public static void demoMethod(double y)
  {
    int x = -1111, y = -2222;
    System.out.println("In demoMethod(int), x is " + x);
    System.out.println("In demoMethod(int), y is " + y);
  }
}
