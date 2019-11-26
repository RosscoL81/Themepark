package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(
            String name,
            String ownerName,
            ParkingSpot parkingSpot)
    {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        int minAge = 18;
        if (visitor.getAge() >= minAge){
            return true;
        }
        return false;
    }

    public int getRating(){
        return 2;
    }
}
