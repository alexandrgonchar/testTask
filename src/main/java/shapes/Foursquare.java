package shapes;

/**
 * @autor Александр
 * @version 1.0
 */
public class Foursquare implements Shape {

    private double square;
    private String colour;

    /**
     * Площадь и цвет генерируються при создании экземпляра класса
     * @see shapes.Shape
     * */
    public Foursquare() {
        this.square = generateSquare();
        this.colour = generateColour();
    }

    public double getSquare() {
        return square;
    }

    public String getColour() {
        return colour;
    }

    public double getSide() {
        return Math.sqrt(square);
    }

    @Override
    public String toString() {
        return "Фигура: квадрат, " +
                "площадь: " + df.format(getSquare()) + " кв. ед." +
                ", длина стороны: " + df.format(getSide()) + " ед." +
                ", цвет: " + getColour();
    }
}
