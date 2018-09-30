package draw;

import shapes.Shape;
import shapes.Triangle;

public class TriangleDraw extends Draw {

    @Override
    public Shape draw() {
        return new Triangle();
    }
}
