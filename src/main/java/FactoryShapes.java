import draw.*;

import java.util.ArrayList;

public class FactoryShapes {

    private static Draw getShapeFromNumber(int number) {
        Draw drawMethod = null;

        switch (number) {
            case 1:
                drawMethod = new FoursquareDraw();
                break;

            case 2:
                drawMethod = new TriangleDraw();
                break;
            case 3:
                drawMethod = new CircleDraw();
                break;
            case 4:
                drawMethod = new TrapezeDraw();
                break;
        }

        return drawMethod;
    }

    public static void main(String[] args) {
        ArrayList shapes = new ArrayList();
        int countOfShapes = (int)(1 + Math.random() * 10);

        for (int i = 0; i < countOfShapes; i++) {

            int shapeNumber = (int)(1 + Math.random() * 4);
            shapes.add(getShapeFromNumber(shapeNumber).draw());
            System.out.println(shapes.get(i));
        }

    }
}
