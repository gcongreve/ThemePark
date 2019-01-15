import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

  Visitor visitor;

  @Before
  public void before(){
      visitor = new Visitor(18, 6.01, 14.99);
  }


  @Test
  public void canHaveAge(){
    assertEquals(18, visitor.getAge());
  }

  @Test
  public void canHaveHeight(){
    assertEquals(6.01, visitor.getHeight(), 0.01);
  }

  @Test
  public void canHaveMoney(){
    assertEquals(14.99, visitor.getMoney(), 0.01);
  }

}
