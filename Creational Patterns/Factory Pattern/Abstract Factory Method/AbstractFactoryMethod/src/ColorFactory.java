import colors.Blue;
import colors.Color;
import colors.Green;
import colors.Red;
import shapes.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        switch (color.toLowerCase()) {
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            case "red":
                return new Red();
            default:
                return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
