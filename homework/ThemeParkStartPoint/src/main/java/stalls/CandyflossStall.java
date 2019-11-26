package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall implements IReviewed {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public int getRating(){
        return 5;
    }


}
