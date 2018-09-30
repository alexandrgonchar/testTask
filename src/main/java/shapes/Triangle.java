package shapes;

public class Triangle implements Shape {

    private double square;
    private String colour;

    public Triangle() {
        this.square = generateSquare();
        this.colour = generateColour();
    }

    public double getSquare() {
        return square;
    }

    public String getColour() {
        return colour;
    }

    public double getHypotenuse() {
        return Math.sqrt((square * 2) * 2);
    }

    @Override
    public String toString() {
        return "Фигура: треугольник, " +
                "площадь: " + df.format(getSquare()) + " кв. ед." +
                ", гипотенуза: " + df.format(getHypotenuse()) + " ед." +
                ", цвет: " + getColour();
    }
}
