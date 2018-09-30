import draw.*;

import java.util.ArrayList;

public class FactoryShapes {

    private static Draw getShapeFromNumber(int number) {
        Draw drawMathod = null;

        switch (number) {
            case 1:
                drawMathod = new FoursquareDraw();
                break;

            case 2:
                drawMathod = new TriangleDraw();
                break;
            case 3:
                drawMathod = new CircleDraw();
                break;
            case 4:
                drawMathod = new TrapezeDraw();
                break;
        }

        return drawMathod;
    }

    public static void main(String[] args) {
        ArrayList shapes = new ArrayList();
        int countOfShapes = (int)(1 + Math.random() * 9);

        for (int i = 0; i < countOfShapes; i++) {

            int shapeNumber = (int)(1 + Math.random() * 3);
            shapes.add(getShapeFromNumber(shapeNumber).draw());
            System.out.println(shapes.get(i));
        }

    }
}
