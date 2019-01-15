package AttractionTests;

import Attractions.Dodgems;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Dave's Dodgems");
        youngVisitor = new Visitor(10, 6.9, 20.00);
        oldVisitor = new Visitor(44, 4.5, 56.00);
    }

    @Test
    public void canHaveName(){
        assertEquals("Dave's Dodgems", dodgems.getName());
    }

    @Test
    public void ratingStartsAtZero() {
        assertEquals(0, dodgems.getRating());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void youngAndOldPayDifferent() {
        assertEquals(2.25, dodgems.priceForVisitor(youngVisitor), 0.01);
        assertEquals(4.50, dodgems.priceForVisitor(oldVisitor), 0.01);
    }
}
