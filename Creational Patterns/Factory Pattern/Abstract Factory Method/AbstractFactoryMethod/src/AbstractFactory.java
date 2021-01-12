import colors.Color;
import shapes.Shape;

public abstract class AbstractFactory {
    // Not following interface segregation principle
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
