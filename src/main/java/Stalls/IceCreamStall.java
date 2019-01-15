package Stalls;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public Double defaultPrice() {
        return 2.80;
    }

    public Double priceForVisitor() {
        return defaultPrice();
    }
}
