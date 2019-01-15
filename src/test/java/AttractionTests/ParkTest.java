package AttractionTests;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Pat's Park");
    }

    @Test
    public void canHaveName(){
        assertEquals("Pat's Park", park.getName());
    }
}
