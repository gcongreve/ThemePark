package AttractionTests;

import Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor youngVisitor;
    Visitor oldVisitor;

    @Before
    public void before(){
        playground = new Playground("Pat's Playground");
        youngVisitor = new Visitor(14, 6.01, 20.00);
        oldVisitor = new Visitor(40, 5.12, 40.00);
    }

    @Test
    public void canHaveName(){
        assertEquals("Pat's Playground", playground.getName());
    }

    @Test
    public void over15sNotAllowed() {
        assertEquals(false, playground.isAllowedTo(oldVisitor));
        assertEquals(true, playground.isAllowedTo(youngVisitor));
    }
}
