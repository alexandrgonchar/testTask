package draw;

import shapes.Shape;
import shapes.Trapeze;

public class TrapezeDraw extends Draw {

    @Override
    public Shape draw() {
        return new Trapeze();
    }
}
