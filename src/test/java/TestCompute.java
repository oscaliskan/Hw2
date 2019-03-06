import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;

public class TestCompute {
  MessageQueue mq;
  Compute c;

  @Before
  public void setUp() {
    mq = mock(MessageQueue.class);
  }

  @Test
  public void testSize() { 
    c = new Compute(mq);
    assertTrue(c.countNumberOfOccurrences(null) == -1); 
  }

  @Test
  public void testNotContains() {
    when(mq.size()).thenReturn(1);
    String str = new String();
    when(mq.contains(str)).thenReturn(false);
    c = new Compute(mq);
    assertTrue(c.countNumberOfOccurrences(str) == 0);
  }

  @Test
  public void testCounter() {
    when(mq.size()).thenReturn(3);
    String str1 = new String("abc");
    String str2 = new String("def");
    when(mq.contains(str1)).thenReturn(true);
    when(mq.getAt(0)).thenReturn(str1);
    when(mq.getAt(1)).thenReturn(str2);
    when(mq.getAt(2)).thenReturn(str1);
    c = new Compute(mq);
    assertFalse(c.countNumberOfOccurrences(str1) != 2);
  }
}