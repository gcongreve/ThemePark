package AttractionTests;

import Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor tallVisitor;
    Visitor smallVisitor;
    Visitor averageVisitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Roy's Rollercoaster");
        tallVisitor = new Visitor(20, 6.6, 10.10);
        averageVisitor = new Visitor(20, 5.11, 90.09);
        smallVisitor = new Visitor(20, 5.1, 10.00);
    }

    @Test
    public void canHaveName(){
        assertEquals("Roy's Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void onlyAllowsTallPeople(){
        assertEquals(true, rollercoaster.isAllowedTo(tallVisitor));
        assertEquals(false, rollercoaster.isAllowedTo(smallVisitor));
    }

    @Test
    public void veryTallPeoplePayMore(){
        assertEquals(8.40, rollercoaster.priceForVisitor(averageVisitor), 0.01);
        assertEquals(16.80, rollercoaster.priceForVisitor(tallVisitor), 0.01);
    }


}
