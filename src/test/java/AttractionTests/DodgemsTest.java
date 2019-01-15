package AttractionTests;

import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Dave's Dodgems");
    }

    @Test
    public void canHaveName(){
        assertEquals("Dave's Dodgems", dodgems.getName());
    }

    @Test
    public void ratingStartsAtZero() {
        assertEquals(0, dodgems.getRating());
    }
}
