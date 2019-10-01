package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating, int visitCount) {

        super(name, rating, visitCount);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 15) {
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
