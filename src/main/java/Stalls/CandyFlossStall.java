package Stalls;

public class CandyFlossStall extends Stall{

    public CandyFlossStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }


    public Double defaultPrice() {
        return 4.20;
    }

    public Double priceForVisitor() {
        return defaultPrice();
    }
}
