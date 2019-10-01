package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 12) {
            if (visitor.getHeight() < 145) {
                return false;
            }

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

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return this.defaultPrice() * 2;
        }
        return this.defaultPrice();
    }
}
