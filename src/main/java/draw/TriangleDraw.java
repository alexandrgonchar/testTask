package draw;

import shapes.Shape;
import shapes.Triangle;


/**
 * @autor Александр
 * @version 1.0
 */
public class TriangleDraw extends Draw {

    /**
     * Создание экземпляра класса Triangle
     * @see shapes.Triangle
     * */
    @Override
    public Shape draw() {
        return new Triangle();
    }
}
