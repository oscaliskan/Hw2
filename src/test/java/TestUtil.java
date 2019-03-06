import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void testLengthZero() {
    int[] arr = {0};
    assertEquals(false,c.compute(arr));
  }
  
  @Test
  public void testLengthEven() {
    int[] arr = {0,1};
    assertEquals(false,c.compute(arr));
  }

  @Test
  public void testSum() {
    int[] arr = {3,5,7,11,13};
    assertTrue(c.compute(arr));
  }
}