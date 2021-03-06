package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    public Rollercoaster(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() > 5.5;
    }

    public Double defaultPrice() {
        return 8.40;
    }

    public Double priceForVisitor(Visitor visitor) {
        if (visitor.getHeight() > 6.3){
            return (defaultPrice() * 2);
        } else {
            return defaultPrice();
        }
    }
}
