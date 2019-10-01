package attractions;

import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating, int visitCount) {

        super(name, rating, visitCount);
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
