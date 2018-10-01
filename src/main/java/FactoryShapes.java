import draw.*;

import java.util.ArrayList;


/**
 * @autor Александр
 * @version 1.0
 */
public class FactoryShapes {

    /**
     * Принимает числовое значение int
     * Возвращает экземпляр потомка Draw по порядковому номеру
     * @see draw
     * */
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

        /** Генерирует размер масива объектов **/
        int countOfShapes = (int)(1 + Math.random() * 10);

        for (int i = 0; i < countOfShapes; i++) {

            /** Генерирует порядковый номер для метода getShapeFromNumber **/
            int shapeNumber = (int)(1 + Math.random() * 4);

            shapes.add(getShapeFromNumber(shapeNumber).draw());
            System.out.println(shapes.get(i));
        }

    }
}
