import static org.junit.Assert.*;
import org.junit.Test;

public class AssertTest{
   @Test
  public void testAssertFalse(){
    System.out.println();
    assertEquals(1,0);
   }
  @Test
  public void testAssertTrue(){
    System.out.println();
    assertEquals(1,1);
   }
}
