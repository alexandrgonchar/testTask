package draw;

import shapes.Foursquare;
import shapes.Shape;


/**
 * @autor Александр
 * @version 1.0
 */
public class FoursquareDraw extends Draw {

    /**
     * Создание экземпляра класса Foursquare
     * @see shapes.Foursquare
     * */
    @Override
    public Shape draw() {
        return new Foursquare();
    }
}
