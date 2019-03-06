import static org.junit.Assert.*;
import java.lang.RuntimeException;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void testLengthOne() {
    assertEquals(false,c.compute(0));
  }
  
  @Test
  public void testEvenLength() {
    assertEquals(false,c.compute(0,1));
  }

  @Test(expected = RuntimeException.class)
  public void testRuntimeException() {
    c.compute(0,1,2,3,4);
  }

  @Test
  public void testSum() {
    assertTrue(c.compute(3,5,7,11,13));
  }

  @Test
  public void testResult() {
    assertEquals(false, c.compute(3,3,5,7,11));
  }
}