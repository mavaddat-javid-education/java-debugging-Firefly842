import java.time.*;
public class TestFusedLoopTime
{
  public static void main(String[] args) {
    long startTime, endTime;
    int x;
    final long REPEAT = 5_000_000L;
    final long FACTOR = 1_000_000L;
    LocalDateTime now;
    now = LocalDateTime.now();
    startTime = now.getNano();
    for(x = 0; x < REPEAT; ++x)
      method1();
    for(x = 0; x < REPEAT; ++x)
      method2();
    now = LocalDateTime.now();
    endTime = now.getNano();
    System.out.println("Time for loops executed separately: " + Long.toUnsignedString((endTime - startTime) / (FACTOR*1000L)) + " seconds");
    now = LocalDateTime.now();
    startTime = now.getNano();
    for(x = 0; x < REPEAT; ++x)
    {
      method1();
      method2();
    }
    now = LocalDateTime.now();
    endTime = now.getNano();
    System.out.println("Time for loops executed in a block: " + ((endTime - startTime) / FACTOR) + " milliseconds");
  }
  public static void method1()
  {
    System.out.print("");
  }
  public static void method2()
  {
    System.out.print("\0");
  }
}
