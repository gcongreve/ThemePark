package StallsTests;

import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Ms CandyFloss", "Dave Prentice", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Ms CandyFloss", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Dave Prentice", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(2, candyFlossStall.getParkingSpot());
    }
}
