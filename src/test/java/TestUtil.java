import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void testLengthIsOne() {assertFalse(c.compute(1));}
  @Test
  public void testLengthIsEven() {assertFalse(c.compute(1,2,3,4));}
  @Test(expected = RuntimeException.class)
  public void testZero() {
    c.compute(1, 0,3);
  }
  @Test
  public void testSumDivisionTrue() {assertTrue(c.compute(1,2,3));}

  @Test
  public void testSumDivisionFalse() {assertFalse(c.compute(3,7,13));}


}