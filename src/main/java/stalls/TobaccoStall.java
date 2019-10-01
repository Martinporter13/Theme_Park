package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() < 18) {
            return false;
        }
        return true;
    }

    @Override
    public int getRating(int rating) {
        return 0;
    }

    @Override
    public String getName(String name) {
        return null;
    }
}
