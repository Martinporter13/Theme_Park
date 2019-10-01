package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating, int visitCount) {

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

    @Override
    public double defaultPrice() {
        return 4.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.defaultPrice() / 2;
        }
        return this.defaultPrice();
    }
}
