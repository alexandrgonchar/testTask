package draw;

import shapes.Shape;
import shapes.Trapeze;


/**
 * @autor Александр
 * @version 1.0
 */
public class TrapezeDraw extends Draw {

    /**
     * Создание экземпляра класса Trapeze
     * @see shapes.Trapeze
     * */
    @Override
    public Shape draw() {
        return new Trapeze();
    }
}
