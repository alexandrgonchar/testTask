package shapes;

import java.text.DecimalFormat;

public interface Shape {

    DecimalFormat df = new DecimalFormat("#.##");

    default double generateSquare() {
        return (1.0 + Math.random() * 9.0);
    }

    default String generateColour() {
        String colour = "";
        int colourIndex = (int)(1 + Math.random() * 6);

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