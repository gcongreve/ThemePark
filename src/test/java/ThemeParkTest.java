import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark emptyThemePark;
    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    Rollercoaster rollercoaster;
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        emptyThemePark = new ThemePark();
        themePark = new ThemePark();
        park = new Park("The Park");
        playground = new Playground("The Playground");
        dodgems = new Dodgems("The Dodgems");
        rollercoaster = new Rollercoaster("The Rollercoaster");
        candyFlossStall = new CandyFlossStall("CandyFloss", "Mr Floss", 1);
        iceCreamStall = new IceCreamStall("IceCream", "Mr Cream", 2);
        tobaccoStall = new TobaccoStall("Tobacco", "Mrs Tobacco", 3);
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollercoaster);
        themePark.addStall(candyFlossStall);
        themePark.addStall(iceCreamStall);
        themePark.addStall(tobaccoStall);
    }


    @Test
    public void attractionsStartsEmpty() {
        assertEquals(0, emptyThemePark.getAttractions().size());
    }

    @Test
    public void stallsStartsEmpty() {
        assertEquals(0, emptyThemePark.getStalls().size());
    }

    @Test
    public void canTakeInAttractions(){
        assertEquals(4, themePark.getAttractions().size());
    }

    @Test
    public void canTakeInStalls(){
        assertEquals(3, themePark.getStalls().size());
    }





}
