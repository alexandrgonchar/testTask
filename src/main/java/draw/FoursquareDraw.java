package draw;

import shapes.Foursquare;
import shapes.Shape;

public class FoursquareDraw extends Draw {

    @Override
    public Shape draw() {
        return new Foursquare();
    }
}
