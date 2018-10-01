package shapes;


/**
 * @autor Александр
 * @version 1.0
 */
public class Trapeze implements Shape {

    private double square;
    private String colour;

    /**
     * Площадь и цвет генерируються при создании экземпляра класса
     * @see shapes.Shape
     * */
    public Trapeze() {
        this.square = generateSquare();
        this.colour = generateColour();
    }

    public double getSquare() {
        return square;
    }

    public String getColour() {
        return colour;
    }

    public double getHeight() {
        return square / 2;
    }

    @Override
    public String toString() {
        return "Фигура: трапеция, " +
                "площадь: " + df.format(getSquare()) + " кв. ед." +
                ", высота: "  + df.format(getHeight()) + " ед." +
                ", цвет: " + getColour();
    }
}
