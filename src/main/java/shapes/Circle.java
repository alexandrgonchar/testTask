package shapes;


/**
 * @autor Александр
 * @version 1.0
 */
public class Circle implements Shape {

    private double square;
    private String colour;

    /**
     * Площадь и цвет генерируються при создании экземпляра класса
     * @see shapes.Shape
     * */
    public Circle() {
        this.square = generateSquare();
        this.colour = generateColour();
    }

    public double getSquare() {
        return square;
    }

    public String getColour() {
        return colour;
    }

    public double getRadius() {
        return Math.sqrt(square / Math.PI);
    }

    @Override
    public String toString() {
        return "Фигура: круг, " +
                "площадь: " + df.format(getSquare()) + " кв. ед." +
                ", радиус: " + df.format(getRadius()) + " ед." +
                ", цвет: " + getColour();
    }
}
