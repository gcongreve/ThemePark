package StallsTests;

import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ms Ice Cream", "Dave Prentice", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Ms Ice Cream", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Dave Prentice", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(1, iceCreamStall.getParkingSpot());
    }
}
