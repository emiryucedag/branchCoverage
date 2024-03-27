import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void TestIsEmpty() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    c = new Compute(mq);
    assertEquals(-1, c.countNumberOfOccurrences("test1"));
  }

  @Test
  public void TestContains() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(10);
    when(mq.contains(anyString())).thenReturn(false);

    c = new Compute(mq);
    assertEquals(0, c.countNumberOfOccurrences("test2"));
  }

  @Test
  public void TestCounterOnce() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains("test")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("test");
    when(mq.getAt(1)).thenReturn("test+1");
    when(mq.getAt(2)).thenReturn("test+2");

    c = new Compute(mq);
    assertEquals(1, c.countNumberOfOccurrences("test"));
  }

  @Test
  public void TestCounterMultipleTimes() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(5);
    when(mq.contains("test")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("test");
    when(mq.getAt(1)).thenReturn("test");
    when(mq.getAt(2)).thenReturn("test+1");
    when(mq.getAt(3)).thenReturn("test");
    when(mq.getAt(4)).thenReturn("test");

    c = new Compute(mq);
    assertEquals(4, c.countNumberOfOccurrences("test"));
  }






}