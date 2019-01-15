package Attractions;

import Interfaces.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed {


    public Dodgems(String name){
        super(name);
    }


    public Double defaultPrice() {
        return 4.50;
    }


    public Double priceForVisitor(Visitor visitor) {
        if (visitor.getAge() < 12){
            return defaultPrice() / 2;
        }
        else {
            return defaultPrice();
        }
    }
}
