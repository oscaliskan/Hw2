import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  MessageQueue mq; 
  Compute c;


  @Test
  public void testSize() { 
    mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(c.countNumberOfOccurrences(null) == -1); 
  }
}