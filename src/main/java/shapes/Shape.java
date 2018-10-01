package shapes;

import java.text.DecimalFormat;


/**
 * @autor Александр
 * @version 1.0
 */

public interface Shape {

    /**
     * Округляет значения double до десятых
     * */
    DecimalFormat df = new DecimalFormat("#.##");

    /** Генерирует рандомную площадь от 1 до 10 */
    default double generateSquare() {
        return (1.0 + Math.random() * 9.0);
    }

    /** Генерирует рандомный цвет */
    default String generateColour() {
        String colour = "";
        int colourIndex = (int)(1 + Math.random() * 7);

        switch (colourIndex) {
            case 1:
                colour = "красный";
                break;

            case 2:
                colour =  "оранжевый";
                break;

            case 3:
                colour = "желтый";
                break;

            case 4:
                colour = "зеленый";
                break;

            case 5:
                colour = "голубой";
                break;

            case 6:
                colour =  "синий";
                break;

            case 7:
                colour = "фиолетовый";
                break;
        }

        return colour;
    }
}
