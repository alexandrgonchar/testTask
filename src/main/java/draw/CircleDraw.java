package draw;

import shapes.Circle;
import shapes.Shape;

public class CircleDraw extends Draw {

    @Override
    public Shape draw() {
        return new Circle();
    }
}
