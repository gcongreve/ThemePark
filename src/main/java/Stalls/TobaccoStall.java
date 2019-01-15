package Stalls;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall (String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() > 18;
    }


    public Double defaultPrice() {
        return 6.60;
    }

    public Double priceForVisitor(Visitor visitor) {
        return defaultPrice();
    }
}
