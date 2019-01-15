package StallsTests;

import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor oldVisitor;
    Visitor youngVisitor;



    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Ms Tobacco", "Dave Prentice", 3);
        oldVisitor = new Visitor(19, 6.00, 10.00);
        youngVisitor = new Visitor(10, 4.00, 17.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ms Tobacco", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Dave Prentice", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(3, tobaccoStall.getParkingSpot());
    }

    @Test
    public void onlyOver18s() {
        assertEquals(true, tobaccoStall.isAllowedTo(oldVisitor));
        assertEquals(false, tobaccoStall.isAllowedTo(youngVisitor));
    }
}
