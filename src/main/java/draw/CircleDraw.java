package draw;

import shapes.Circle;
import shapes.Shape;


/**
 * @autor Александр
 * @version 1.0
 */
public class CircleDraw extends Draw {

    /**
     * Создание экземпляра класса Circle
     * @see shapes.Circle
     * */
    @Override
    public Shape draw() {
        return new Circle();
    }
}
